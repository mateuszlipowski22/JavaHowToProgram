package section_17.t_17_11;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class FileAndDirectoryInfo {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.println("Wpisz nazwę pliku lub folder");

        Path path = Paths.get(input.nextLine());

        if(Files.exists(path)){
            if(Files.isDirectory(path)){
                System.out.printf("Zawartość folderu:%n");
                DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
                Stream<Path> stream = StreamSupport.stream(directoryStream.spliterator(), false);
                Map<Boolean, Long> directoryCount = stream.collect(Collectors.groupingBy(Files::isDirectory, TreeMap::new,Collectors.counting()));

                directoryCount.forEach((key, value) -> System.out.printf("%B : %d %n", key, value));
            }
        }else {
            System.out.printf("%s nie istnieje%n", path);
        }
    }
}
