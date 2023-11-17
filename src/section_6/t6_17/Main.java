package section_6.t6_17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wprowadz liczbe :");
            int number = scanner.nextInt();
            while(number!=0){
                System.out.printf("Liczba %d%s jest przysta %n",
                        number, (isEven(number))?"":" nie");
                System.out.println("Wprowadz kolejna liczbe (0 aby wyjsc):");
                number = scanner.nextInt();
            }

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    public static boolean isEven(int number){
        return number%2==0;
    }
}
