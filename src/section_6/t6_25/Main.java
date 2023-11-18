package section_6.t6_25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wprowadz granice :");
            int limit = scanner.nextInt();

            for (int i = 2; i <= limit; i++) {
                if (isPrime(i)) {
                    System.out.printf("Liczba %d jest liczbą pierwszą %n", i);
                }
            }

        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
