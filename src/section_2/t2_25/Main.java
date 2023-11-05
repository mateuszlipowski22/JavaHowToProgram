package section_2.t2_25;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Podaj liczbe : ");
            int number = scanner.nextInt();

            System.out.printf("Liczba %d jest %s", number, number % 2 == 0 ? "parzysta" : "nieparzysta");

        } catch (Exception e) {
            System.out.println("Błąd podczas wykonywania programu -> " + e.getMessage());
        }
    }
}
