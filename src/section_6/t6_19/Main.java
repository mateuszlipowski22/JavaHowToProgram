package section_6.t6_19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wprowadz długosc boku :");
            int number = scanner.nextInt();

            System.out.println("Wprowadz znak do budowy kwadratu :");
            char character = scanner.next().charAt(0);

            squareOfChar(number,character);

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    private static void squareOfChar(int number, char character){
        System.out.print(String.format("%s%n", String.valueOf(character).repeat(number)).repeat(number));
    }
}
