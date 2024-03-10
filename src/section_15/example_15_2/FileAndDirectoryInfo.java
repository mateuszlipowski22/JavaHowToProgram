package section_15.example_15_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileAndDirectoryInfo {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.println("Wpisz nazwę pliku lub fodler");

        Path path = Paths.get(input.nextLine());

        if(Files.exists(path)){
            System.out.printf("%n%s istnieje%n", path.getFileName());
            System.out.printf("%s folderem%n", Files.isDirectory(path) ? "Jest" : "Nie jest");
            System.out.printf("%s ścieżką bezwzględną%n", path.isAbsolute() ? "Jest" : "Nie jest");
            System.out.printf("Ostatnia modyfikacja: %s%n", Files.getLastModifiedTime(path));
            System.out.printf("Rozmiar: %s%n", Files.size(path));
            System.out.printf("Ścieżka: %s%n", path);
            System.out.printf("Ścieżka bezwzględna: %s%n", path.toAbsolutePath());

            if(Files.isDirectory(path)){
                System.out.printf("Zawartość folderu:%n");
                Files.newDirectoryStream(path).forEach(System.out::println);
            }

        }else {
            System.out.printf("%s nie istnieje%n", path);
        }
    }
}
