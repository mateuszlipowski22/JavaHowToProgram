package section_6.t6_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wprowadz liczbe :");
            double number = scanner.nextDouble();
            System.out.printf("Liczba przed zaokragleniem : %f %n", number);
            System.out.printf("Liczba po zaokragleniu : %d %n", roundToIntegers(number));
            System.out.printf("Liczba po zaokragleniu : %f %n", roundToTenths(number));
            System.out.printf("Liczba po zaokragleniu : %f %n", roundToHundredths(number));
            System.out.printf("Liczba po zaokragleniu : %f %n", roundToThousandths(number));
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    public static double roundToDigit(double number, int digit){
        return Math.floor(number*digit+0.5)/digit;
    }

    public static int roundToIntegers(double number){
        return (int) roundToDigit(number, 1);
    }

    public static double roundToTenths(double number){
        return roundToDigit(number, 10);
    }

    public static double roundToHundredths(double number){
        return roundToDigit(number, 100);
    }

    public static double roundToThousandths(double number){
        return roundToDigit(number, 1000);
    }
}
