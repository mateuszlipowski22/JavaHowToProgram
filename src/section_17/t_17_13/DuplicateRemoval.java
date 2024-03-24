package section_17.t_17_13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class DuplicateRemoval {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        Arrays.stream(scanner.nextLine().split(" "))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(),TreeMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                //.filter(entry -> entry.getValue()==1)
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.printf("%s%n",entry.getKey()));

    }
}
