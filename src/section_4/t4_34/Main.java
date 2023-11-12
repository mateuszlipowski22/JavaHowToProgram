package section_4.t4_34;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ile poteg 2 ma być wyswietlonych?");
            int twos = scanner.nextInt();
            int i = 0;
            while(i<twos){
                System.out.printf("%.0f ",Math.pow(2,i));
                i++;
            }

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
