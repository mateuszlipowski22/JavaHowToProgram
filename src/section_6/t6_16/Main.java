package section_6.t6_16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wprowadz pierwsza liczbe :");
            int firstNumber = scanner.nextInt();

            System.out.println("Wprowadz druga liczbe :");
            int secondNumber = scanner.nextInt();

            System.out.printf("Liczba %d%s jest wielokrotnoscia liczby %d %n",
                    secondNumber, (isMultiple(firstNumber, secondNumber))?"":" nie", firstNumber);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    public static boolean isMultiple(int firstNumber, int secondNumber){
        return firstNumber%secondNumber==0;
    }
}
