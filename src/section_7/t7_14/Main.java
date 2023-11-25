package section_7.t7_14;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ile wprowadzisz liczb?");
            int[] numbers = new int[scanner.nextInt()];

            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Wprowadź liczbę");
                int temp = scanner.nextInt();
                numbers[i] = temp;
            }

            System.out.println(Arrays.toString(numbers));
            System.out.println("Iloczyn wynosi : " + product(numbers));
        } catch (
                Exception e) {
            e.getStackTrace();
        }
    }

    public static int product(int[] table) {
        return Arrays.stream(table).reduce(1, (left, right) -> left * right);
    }
}
