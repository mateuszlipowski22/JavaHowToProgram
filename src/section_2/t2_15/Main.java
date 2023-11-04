package section_2.t2_15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try{
            Scanner scanner = new Scanner(System.in);

            System.out.print("Podaj pierwsza liczbe : ");
            int first = scanner.nextInt();
            System.out.print("Podaj druga liczbe : ");
            int second = scanner.nextInt();

            System.out.printf("Pierwsza liczba : %d %n" +
                    "Druga liczba : %d %n" +
                    "Wynik dodwania : %d %n" +
                    "Wynik odejmowania : %d %n" +
                    "Wynik mnozenia : %d %n" +
                    "Wynik dzielenia : %d %n", first, second, first+second, first-second, first*second, first/second);
        }catch (Exception e){
            System.out.println("Błąd podczas wykonywania programu -> "+e.getMessage());
        }
    }
}
