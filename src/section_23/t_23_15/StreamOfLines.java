package section_23.t_23_15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.NumberFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StreamOfLines {
    public static void main(String[] args) throws IOException {
        Pattern pattern = Pattern.compile("\\s+");

        System.out.println("Rozpoczęcie szeregowe");
        Instant countStart = Instant.now();

        Map<String, Long> wordCounts = Files.lines(Paths.get("C:\\programowanie\\java\\JavaHowToProgram\\src\\section_23\\t_23_15\\Chapter2Paragraph.txt"))
                .flatMap(line -> pattern.splitAsStream(line))
                .collect(Collectors.groupingBy(String::toLowerCase, TreeMap::new,Collectors.counting()));

        wordCounts.entrySet()
                .stream()
                .collect(
                        Collectors.groupingBy(entry->entry.getKey().charAt(0),
                                TreeMap::new,
                                Collectors.toList()))
                .forEach((letter,wordList)->{
                    System.out.printf("%n%C%n",letter);
                    wordList.stream().forEach(word-> System.out.printf("%13s: %d%n",word.getKey(),word.getValue()));
                });

        Instant countEnd = Instant.now();

        long countTime = Duration.between(countStart,countEnd).toMillis();
        System.out.printf("Łączny czas w milisekundach: %d%n%n",countTime);


        System.out.println("Rozpoczęcie równoległę");
        Instant parallelCountStart = Instant.now();

        Map<String, Long> wordCountsParallel = Files.lines(Paths.get("C:\\programowanie\\java\\JavaHowToProgram\\src\\section_23\\t_23_15\\Chapter2Paragraph.txt"))
                .flatMap(line -> pattern.splitAsStream(line))
                .collect(Collectors.groupingBy(String::toLowerCase, TreeMap::new,Collectors.counting()));

        wordCountsParallel.entrySet()
                .stream().parallel()
                .collect(
                        Collectors.groupingBy(entry->entry.getKey().charAt(0),
                                TreeMap::new,
                                Collectors.toList()))
                .forEach((letter,wordList)->{
                    System.out.printf("%n%C%n",letter);
                    wordList.stream().parallel().forEach(word-> System.out.printf("%13s: %d%n",word.getKey(),word.getValue()));
                });

        Instant parallelCountEnd = Instant.now();

        long parallelCountTime = Duration.between(parallelCountStart,parallelCountEnd).toMillis();
        System.out.printf("Łączny czas w milisekundach: %d%n%n",parallelCountTime);

        String percentage = NumberFormat.getPercentInstance().format((double) (countTime-parallelCountTime)/parallelCountTime);
        System.out.printf("sort załęło %s więcej czasu niż parallelSort%n%n",percentage);

    }
}
