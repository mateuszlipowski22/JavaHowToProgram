package section_6.t6_30;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {
    private static final SecureRandom secureRandom = new SecureRandom();
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            String game="tak";
            while(!game.equals("n")){
                System.out.println("Losuje liczbe z przedziału od 1 do 1000");
                int numberToGuess = secureRandom.nextInt(2)+1;
                int round = 1;
                System.out.println("Wprowadz pierwszy typ : ");
                int guess = scanner.nextInt();

                while(guess!=numberToGuess){
                    if(guess>numberToGuess){
                        System.out.println("Za wysoko");
                    }else {
                        System.out.println("Za nisko");
                    }
                    System.out.println("Wprowadz kolejny typ : ");
                    guess = scanner.nextInt();
                    round++;
                }
                System.out.printf("Hurra !!! Szukana liczba to %d. Zwycięstwo w %d ruchach %n", numberToGuess, round);
                System.out.println("Czy chesz zagrac ponownie? n - wyjscie");
                game=scanner.next();
            }
            System.out.println("Koniec gry");

        } catch (Exception e) {
            e.getStackTrace();
        }
    }

}
