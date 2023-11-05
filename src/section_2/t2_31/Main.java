package section_2.t2_31;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Podaj liczbe : ");
            int number = scanner.nextInt();

            System.out.printf("%10s %10s %10s %n", "liczba", "kwadrat", "szescian");

            for (int i = 1; i < number+1; i++) {
                System.out.printf("%10d %10d %10d %n", i, i*i, i*i*i);
            }

        } catch (Exception e) {
            System.out.println("Błąd podczas wykonywania programu -> " + e.getMessage());
        }
    }
}
