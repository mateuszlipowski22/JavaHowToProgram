package section_6.t6_32;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wprowadz wspólrzedna x pierwszego punktu : ");
            double x1 = scanner.nextDouble();
            System.out.println("Wprowadz wspólrzedna y pierwszego punktu : ");
            double y1 = scanner.nextDouble();
            System.out.println("Wprowadz wspólrzedna x drugiego punktu : ");
            double x2 = scanner.nextDouble();
            System.out.println("Wprowadz wspólrzedna y drugiego punktu : ");
            double y2 = scanner.nextDouble();
            System.out.printf("Odleglość pomiedzy punktem (%f,%f) a punktem (%f,%f) wynosi %f",
                    x1,y1,x2,y2, pointDistance(x1,y1,x2,y2) );
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    private static double pointDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    }
}
