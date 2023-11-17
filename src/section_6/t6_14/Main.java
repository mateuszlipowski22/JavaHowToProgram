package section_6.t6_14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wprowadz baze :");
            double base = scanner.nextDouble();

            System.out.println("Wprowadz potege :");
            int exponent = scanner.nextInt();

            System.out.printf("Liczba %f do potęgi %d wynosi %f %n", base, exponent, integerPower(base,exponent));
            System.out.printf("Liczba %f do potęgi %d wynosi %f %n", base, exponent, Math.pow(base,exponent));
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    public static double integerPower(double base, int exponent){
        int i=1;
        double result = 1;
        while (i<=exponent){
            result=result*base;
            i++;
        }
        return result;
    }
}
