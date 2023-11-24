package section_7.t7_10;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int[] results = new int[11];

    public static void main(String[] args) {
        try {
            Arrays.fill(results, 0);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wprowadz kwote sprzedazy pierwszego pracownika");
            double saleAmount = scanner.nextDouble();

            while (saleAmount > 0) {
                int index = getRangeIndex(saleAmount);
                results[index]++;
                System.out.println("Wprowadz kwote sprzedazy kolejnego pracownika (albo ujemna wartosc do wyjscia)");
                saleAmount = scanner.nextDouble();
                displayResults(results);
            }

            System.out.println("Finalny wynik ankiety");
            displayResults(results);

        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public static int getRangeIndex(double saleAmount) {
        return switch ((int) ((0.09 * saleAmount + 2000) / 100)) {
            case 20 -> 0;
            case 21 -> 1;
            case 22 -> 2;
            case 23 -> 3;
            case 24 -> 4;
            case 25 -> 5;
            case 26 -> 6;
            case 27 -> 7;
            case 28 -> 8;
            case 29 -> 9;
            case 30 -> 10;
            default -> 0;
        };
    }

    public static void displayResults(int[] table) {
        for (int i = 0; i < table.length; i++) {
            System.out.printf("%4d-%4d : %d %s %n", 2000 + i * 100, 2099 + i * 100, table[i], "*".repeat(table[i]));
        }
    }
}
