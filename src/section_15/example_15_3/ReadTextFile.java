package section_15.example_15_3;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile {
    public static void main(String[] args) throws IOException {
        try(Scanner input = new Scanner(Paths.get(FileUtil.FILE_PATH))){
            System.out.printf("%-10s%-12s%-12s%10s%n","Konto", "Imię","Nazwisko","Saldo");
            while (input.hasNext()){
                System.out.printf("%-10d%-12s%-12s%10.2f%n",
                        input.nextInt(), input.next(),input.next(),input.nextDouble());
            }
        } catch (IOException | NoSuchElementException | IllegalStateException e) {
            e.printStackTrace();
        }
    }
}
