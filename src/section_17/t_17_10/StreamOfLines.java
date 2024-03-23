package section_17.t_17_10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StreamOfLines {
    public static void main(String[] args) throws IOException {
        Pattern pattern = Pattern.compile("\\s+");

        Map<Character, Long> letterCounts = Files.lines(Paths.get("C:\\programowanie\\java\\JavaHowToProgram\\src\\section_17\\e_17_22\\Chapter2Paragraph.txt"))
                .flatMap(pattern::splitAsStream)
                .map(String::toLowerCase)
                .flatMapToInt(String::chars)
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),TreeMap::new, Collectors.counting()));

        letterCounts.forEach((key, value) -> System.out.printf("%C : %d %n", key, value));
    }
}
