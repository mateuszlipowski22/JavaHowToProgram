package section_6.t6_22;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wprowadz symbol przeliczenia :");
            String choice = scanner.next();

            while(!Objects.equals(choice, "q")){
                System.out.println("Wprowadz temperature do przeliczenia :");
                double temp = scanner.nextDouble();
                switch (choice){
                    case "c":
                        celsiusToFahrenheit(temp);
                        break;
                    case "f":
                        fahrenheitCelsius(temp);
                        break;
                }
                System.out.println("Wprowadz symbol przeliczenia :");
                choice = scanner.next();
            }

        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    private static void fahrenheitCelsius(double temp) {
        System.out.printf("%.2f F to %.2f C %n", temp, 5.0 / 9.0 * (temp - 32));
    }

    private static void celsiusToFahrenheit(double temp) {
        System.out.printf("%.2f C to %.2f F %n", temp, 9.0 / 5.0 * temp +32);
    }
}
