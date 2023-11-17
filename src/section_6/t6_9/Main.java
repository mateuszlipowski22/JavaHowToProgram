package section_6.t6_9;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wprowadz liczbe :");
            double number = scanner.nextDouble();
            System.out.printf("Liczba przed zaokragleniem : %f %n", number);
            System.out.printf("Liczba po zaokragleniu : %d %n", roundToClosestInt(number));
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    public static int roundToClosestInt(double number){
        return (int) Math.floor(number+0.5);
    }
}
