package section_2.t2_26;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Podaj pierwsza liczbe : ");
            int first = scanner.nextInt();
            System.out.print("Podaj druga liczbe : ");
            int second = scanner.nextInt();

            System.out.printf("Liczba %d %s wielokrotnością liczby %d ", first, first % second == 0 ? "jest" : "nie jest", second);

        } catch (Exception e) {
            System.out.println("Błąd podczas wykonywania programu -> " + e.getMessage());
        }
    }
}
