package section_4.t4_38;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbe z którj cchesz policzyć silnię : ");
            int number = scanner.nextInt();

            System.out.printf("Wartość silni z liczby %d wynosi %d %n", number, power(number));
            System.out.printf("Przyblizenie liczby e z %d rzedami wynosi %f %n", number, eApproximation(number));
            System.out.printf("e podniesione do potęgi %d wynosi %f %n", number, eToPow(number));

        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public static int power(int number) {
        int result = 1;
        while (number > 0) {
            result = result * number;
            number--;
        }
        return result;
    }

    public static double eApproximation(int number) {
        double e = 0;
        for (int i = 0; i <= number; i++) {
            e = e + (double) 1 / (power(i));
        }
        return e;
    }

    public static double eToPow(int number) {
        double e = 1;
        for (int i = 0; i < 10; i++) {
            e = e + (Math.pow(number, i)) / (power(i));
        }

        // 0->1 1->2 2->4 3->9,5
        return e;
    }
}
