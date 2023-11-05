package section_2.t2_33;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Podaj wage w kilogramach : ");
            double weightInKg = scanner.nextInt();
            System.out.print("Podaj wzrost w centymetrach : ");
            double heightInCm = scanner.nextInt();

            System.out.printf("Twoj BMI to %.2f ", weightInKg/((heightInCm/100)*(heightInCm/100)));

        } catch (Exception e) {
            System.out.println("Błąd podczas wykonywania programu -> " + e.getMessage());
        }
    }
}
