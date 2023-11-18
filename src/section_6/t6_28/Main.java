package section_6.t6_28;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wprowadz srednia ucznia : ");
            int score = scanner.nextInt();
            System.out.printf("Ocena ucznia se zrednią %d wynosi %d ",
                    score, qualityPoints(score) );
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    private static int qualityPoints(int averageScore) {
        return switch (averageScore/10){
            case 10, 9 -> 4;
            case 8 -> 3;
            case 7 -> 2;
            case 6 -> 1;
            default -> 0;
        };
    }
}
