package section_7.t7_12;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wprowadź perwszą liczbne");
            int[] numbers = new int[5];
            numbers[0] = scanner.nextInt();

            for (int i = 1; i < 5; i++) {
                System.out.println("Wprowadź kolejną liczbę");
                int temp = scanner.nextInt();

                while (temp == numbers[i - 1]) {
                    System.out.println("Duplikat wprowadź inna liczbę");
                    temp = scanner.nextInt();
                }
                numbers[i] = temp;
            }
            Arrays.stream(numbers).forEach(number -> System.out.println("Kolejne liczby to : " + number));
        } catch (
                Exception e) {
            e.getStackTrace();
        }
    }
}
