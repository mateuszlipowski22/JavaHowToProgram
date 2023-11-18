package section_6.t6_23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wprowadz pierwszą liczbe :");
            double firstNumber = scanner.nextDouble();

            System.out.println("Wprowadz drugą liczbe :");
            double secondNumber = scanner.nextDouble();

            System.out.println("Wprowadz trzecią liczbe :");
            double thirdNumber = scanner.nextDouble();

            System.out.printf("The minimum of %f, %f and %f is %f",
                    firstNumber, secondNumber,thirdNumber,getMinimum(firstNumber,secondNumber,thirdNumber));

        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    private static double getMinimum(double firstNumber, double secondNumber, double thirdNumber) {
        return Math.min(firstNumber, Math.min(secondNumber,thirdNumber));
    }
}
