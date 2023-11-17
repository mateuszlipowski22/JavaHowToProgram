package section_6.t6_18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wprowadz długosc boku :");
            int number = scanner.nextInt();
            squareOfAsterix(number);

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    public static void squareOfAsterix(int number){
        squareOfChar(number,'*');
    }

    private static void squareOfChar(int number, char character){
        System.out.print(String.format("%s%n", String.valueOf(character).repeat(number)).repeat(number));
    }
}
