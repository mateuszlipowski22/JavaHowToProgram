package section_11.example_11_2;

import java.util.Scanner;

public class DivideByZeroNoExceptionHandling {

    public static int quotient(int numerator, int denominator){
        return numerator/denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz licznik (liczba całkowita) : ");
        int numerator = scanner.nextInt();

        System.out.println("Wpisz mianownik (liczba całkowita) : ");
        int denominator = scanner.nextInt();

        int result = quotient(numerator,denominator);

        System.out.printf("%nWynik %d / %d = %d%n",numerator,denominator,result);
    }
}
