package section_2.t2_28;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Podaj promień koła : ");
            int radius = scanner.nextInt();

            System.out.printf("Promień koła : %d %n" +
                    "Średnica koła : %d %n" +
                    "Obwód koła : %.2f %n" +
                    "Pole koła : %.2f %n", radius, 2*radius, 2*radius*Math.PI, radius*radius*Math.PI);

        } catch (Exception e) {
            System.out.println("Błąd podczas wykonywania programu -> " + e.getMessage());
        }
    }
}
