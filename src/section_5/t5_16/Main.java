package section_5.t5_16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wprowadz ilosc liczb do wykresu");
            int number = scanner.nextInt();

            List<Integer> numbers = new ArrayList<>();

            for (int i = 0; i < number; i++) {
                System.out.printf("Wprowadz liczbe numer %d : ", i + 1);
                int nextNumber = scanner.nextInt();
                while(nextNumber>30 || nextNumber<0){
                    System.out.println("Wprowadz poprawną liczbę");
                    nextNumber = scanner.nextInt();
                }
                numbers.add(nextNumber);
            }

            System.out.println("Wykres liczb:");
            Collections.sort(numbers);
            numbers.forEach(num-> System.out.printf("%2d : %s %n",num, "*".repeat(num)));

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
