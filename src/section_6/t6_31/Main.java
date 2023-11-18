package section_6.t6_31;

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
                int numberToGuess = secureRandom.nextInt(1000)+1;
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

                if(round<10){
                    System.out.println("Znalazłeś sekretną liszbę lub miałeś szczeście");
                }else if(round==10){
                    System.out.println("Aha, teraz znasz sekret");
                }else {
                    System.out.println("Słabo Ci poszło");
                }
                System.out.printf("Szukana liczba to %d. Zwycięstwo w %d ruchach %n", numberToGuess, round);
                System.out.println("Czy chesz zagrac ponownie? n - wyjscie");
                game=scanner.next();
            }
            System.out.println("Koniec gry");

        } catch (Exception e) {
            e.getStackTrace();
        }
    }

}
