package section_6.t6_20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wprowadz promień koła :");
            double radius = scanner.nextDouble();

            System.out.printf("Pole koła o promienu %.2f wynosi wielokrotnoscia liczby %.2f %n",
                    radius, circleArea(radius));

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    private static double circleArea(double radius){
        return Math.PI*radius*radius;
    }
}
