package section_5.t5_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wprowadz liczbe liczb do sprawdzenia");
            int number = scanner.nextInt();

            List<Integer> numbers = new ArrayList<>();

            for (int i = 0; i < number; i++) {
                System.out.printf("Wprowadz liczbe numer %d : ", i + 1);
                numbers.add(scanner.nextInt());
            }
            Collections.sort(numbers);

            System.out.printf("Najmniejsza liczba to : %d", numbers.get(0));
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
