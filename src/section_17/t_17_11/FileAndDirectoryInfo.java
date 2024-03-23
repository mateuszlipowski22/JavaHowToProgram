package section_17.t_17_11;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileAndDirectoryInfo {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.println("Wpisz nazwę pliku lub folder");

        Path path = Paths.get(input.nextLine());

        if(Files.exists(path)){
            if(Files.isDirectory(path)){
                System.out.printf("Zawartość folderu:%n");
                DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);

            }
        }else {
            System.out.printf("%s nie istnieje%n", path);
        }
    }
}
