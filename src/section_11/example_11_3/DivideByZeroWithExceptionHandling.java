package section_11.example_11_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling {

    public static int quotient(int numerator, int denominator){
        return numerator/denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuesLoop = true;

        do{
            try{
                System.out.println("Wpisz licznik (liczba całkowita) : ");
                int numerator = scanner.nextInt();
                System.out.println("Wpisz mianownik (liczba całkowita) : ");
                int denominator = scanner.nextInt();

                int result = quotient(numerator,denominator);
                System.out.printf("%nWynik %d / %d = %d%n",numerator,denominator,result);
                continuesLoop=false;

            }catch (InputMismatchException inputMismatchException){
                System.err.printf("%nWyjątek : %s%n",inputMismatchException);
                scanner.nextLine();
                System.out.printf("Musisz wpisać liczby całkowite. Spróbuj ponownie.%n%n");
            }catch (ArithmeticException arithmeticException){
                System.err.printf("%nWyjątek : %s%n",arithmeticException);
                System.out.printf("Zero nie jest poprawnym mianownikiem. Spróbuj ponownie.%n%n");
            }
        }while (continuesLoop);
    }
}
