package section_14.example_14_16;

import java.util.Scanner;

public class StaticCharMethods2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz podstawe:");
        int radix = scanner.nextInt();
        System.out.printf("Wybierz : %n1 - %s%n2 - %s%n","zamien cyfre na znak","zamien znak na cyfre");
        int choice = scanner.nextInt();

        switch(choice){
            case 1:
                System.out.println("Wpisz cyfrę:");
                int digit = scanner.nextInt();
                System.out.printf("Zamien cyfre na znak: %s%n", Character.forDigit(digit,radix));
                break;
            case 2:
                System.out.println("Wpisz znak:");
                char character = scanner.next().charAt(0);
                System.out.printf("Zamien znak na cyfre: %s%n", Character.digit(character,radix));
                break;
        }
    }
}
