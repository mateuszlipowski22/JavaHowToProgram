package section_2.t2_30;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Podaj liczbe : ");
            int number = scanner.nextInt();

            List<Integer> digits = new ArrayList<>();

            while(number>0){
                digits.add(number%10);
                number=number/10;
            }
            digits=digits.reversed();

            for(Integer digit : digits){
                System.out.print(digit+" ");
            }

        } catch (Exception e) {
            System.out.println("Błąd podczas wykonywania programu -> " + e.getMessage());
        }
    }
}
