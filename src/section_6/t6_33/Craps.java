package section_6.t6_33;

import java.security.SecureRandom;
import java.util.Scanner;

public class Craps {
    private static final SecureRandom randomNumber = new SecureRandom();

    private enum Status {CONTINUE, WON, LOST}

    ;

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        try {
            int bankAccount = 1000;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Czy chcesz zagrac?");
            String decision = scanner.next();

            while(decision.equals("tak")){
                System.out.println("Ile chcesz postawić??");
                int wager = scanner.nextInt();
                if(bankAccount>=wager){
                    if(play()){
                        bankAccount=bankAccount+wager;
                    }else {
                        bankAccount=bankAccount-wager;
                    }
                }else {
                    System.out.println("Nie masz wystarczających środków");
                }
                if(bankAccount==0){
                    System.out.println("Straciles wszystkie środki - koniec gry golodupcu");
                    break;
                }
                System.out.printf("Status konta to %d",bankAccount);
                System.out.println("Czy chcesz zagrac?");
                decision = scanner.next();
            }

        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public static boolean play() {
        int myPoint = 0;
        Status gameStatus;
        int sumOfDice = rollDice();

        switch (sumOfDice) {
            case SEVEN:
            case YO_LEVEN:
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Punkt to %d%n", myPoint);
                break;
        }

        while (gameStatus == Status.CONTINUE) {
            sumOfDice = rollDice();
            if (sumOfDice == myPoint) {
                gameStatus = Status.WON;
            } else {
                if (sumOfDice == SEVEN) {
                    gameStatus = Status.LOST;
                }
            }
        }

        if (gameStatus == Status.WON) {
            System.out.println("Gracz wygrał");
            return true;
        } else {
            System.out.println("Gracz przegrał");
            return false;
        }
    }

    private static int rollDice() {
        int die1 = 1 + randomNumber.nextInt(6);
        int die2 = 1 + randomNumber.nextInt(6);

        int sum = die1 + die2;

        System.out.printf("Gracz wyrzucił %d + %d = %d %n", die1, die2, sum);

        return sum;
    }
}
