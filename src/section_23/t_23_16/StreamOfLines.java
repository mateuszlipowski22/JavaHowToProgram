package section_23.t_23_16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.NumberFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StreamOfLines {
    public static void main(String[] args) throws IOException {

        Pattern pattern = Pattern.compile("\\s+");

        System.out.println("Rozpoczęcie szeregowe");
        Instant countStart = Instant.now();

        Map<Character, Long> letterCounts = Files.lines(Paths.get("C:\\programowanie\\java\\JavaHowToProgram\\src\\section_17\\e_17_22\\Chapter2Paragraph.txt"))
                .flatMap(pattern::splitAsStream)
                .map(String::toLowerCase)
                .flatMapToInt(String::chars)
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),TreeMap::new, Collectors.counting()));

        letterCounts.forEach((key, value) -> System.out.printf("%C : %d %n", key, value));

        Instant countEnd = Instant.now();

        long countTime = Duration.between(countStart,countEnd).toMillis();
        System.out.printf("Łączny czas w milisekundach: %d%n%n",countTime);


        System.out.println("Rozpoczęcie równoległę");
        Instant parallelCountStart = Instant.now();

        Map<Character, Long> letterCountsParallel = Files.lines(Paths.get("C:\\programowanie\\java\\JavaHowToProgram\\src\\section_17\\e_17_22\\Chapter2Paragraph.txt")).parallel()
                .flatMap(pattern::splitAsStream)
                .map(String::toLowerCase)
                .flatMapToInt(String::chars)
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),TreeMap::new, Collectors.counting()));

        letterCountsParallel.forEach((key, value) -> System.out.printf("%C : %d %n", key, value));

        Instant parallelCountEnd = Instant.now();

        long parallelCountTime = Duration.between(parallelCountStart,parallelCountEnd).toMillis();
        System.out.printf("Łączny czas w milisekundach: %d%n%n",parallelCountTime);

        String percentage = NumberFormat.getPercentInstance().format((double) (countTime-parallelCountTime)/parallelCountTime);
        System.out.printf("Szeregowo zajęło %s więcej czasu niż parallelSort%n%n",percentage);

    }
}
