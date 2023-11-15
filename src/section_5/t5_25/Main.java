package section_5.t5_25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wprowadź szerokość rombu : ");
            int width = scanner.nextInt();
            if(width>19 || width<1){
                System.out.println("Niepoprawna wartość");
            }else {
                drewFigure(width);
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public static void drewFigure(int width) {
        for (int i = 0; i < 2 * width - 1; i++) {
            if (i < width) {
                System.out.printf("%s%s%n",
                        " ".repeat(width - 1 - i),
                        "*".repeat(1 + 2 * i));
            } else {
                System.out.printf("%s%s%n",
                        " ".repeat(i - width + 1),
                        "*".repeat(2 * width - 3 - 2 * (i - width)));
            }
        }
    }
}
