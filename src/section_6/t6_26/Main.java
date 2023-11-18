package section_6.t6_26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wprowadz liczbę do odwrócenia :");
            int number = scanner.nextInt();
            System.out.printf("Odwrócona liczba do %d to %d ",number, reverseNumber(number) );
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    private static int reverseNumber(int number) {
        return Integer.parseInt(new StringBuilder(String.valueOf(number)).reverse().toString());
    }
}
