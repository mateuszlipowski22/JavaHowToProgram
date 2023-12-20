package section_8.t8_18;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    private static Scanner scanner;

    public enum Sign {O,X,EMPTY};

    private Sign[][] gameBoard= new Sign[3][3];

    public TicTacToe() {
        for (Sign[] signs : gameBoard) {
            Arrays.fill(signs, Sign.EMPTY);
        }
    }

    public void clearBoard(){
        for (Sign[] signs : gameBoard) {
            Arrays.fill(signs, Sign.EMPTY);
        }
    }

    public void showGameStatus(){
        System.out.println("-".repeat(21));
        for (Sign[] signs : gameBoard) {
            for (Sign sign : signs) {
                System.out.printf("|%5s|", sign);
            }
            System.out.println();
            System.out.println("-".repeat(21));
        }
        System.out.println();
    }

    public boolean setSign(int x, int y, Sign sign){
        if(x>=1 && x<=3 && y>=1 && y<=3){
            if(this.gameBoard[x-1][y-1]==Sign.EMPTY){
                this.gameBoard[x-1][y-1]=sign;
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }

    public boolean hasWon(Sign sign){

        for (Sign[] signs : gameBoard) {
            if (Arrays.stream(signs).allMatch(element -> element == sign)) {
                return true;
            }
        }


        for (Sign[] signs : gameBoard) {
            for (int j = 0; j < gameBoard.length; j++) {
                if (signs[j] != sign) {
                    break;
                }
                if (j == 2) {
                    return true;
                }
            }
        }

        for(int i=0;i< gameBoard.length;i++){
            if(gameBoard[i][i]!= sign) {
                break;
            }
            if (i == 2) {
                return true;
            }
        }

        for(int i=0;i< gameBoard.length;i++){
            if(gameBoard[i][gameBoard.length-1-i]!= sign) {
                continue;
            }
            if (i == 2) {
                return true;
            }
        }

        return false;
    }

    public void play(){
        scanner=new Scanner(System.in);
        clearBoard();
        int i=1;
        Sign tempSign;

        while(true){
            tempSign = Sign.values()[i%2];
            move(tempSign);
            if(hasWon(tempSign)){
                System.out.printf("%s wygrał",tempSign);
                return;
            }else {
                i++;
            }
        }
    }

    private void move(Sign sign){
        System.out.printf("%s : wprowadz współrzędne x i y ruchu %n",sign);
        while(true){
            System.out.println("Współrzędne x : ");
            int x = scanner.nextInt();
            System.out.println("Współrzędne y : ");
            int y = scanner.nextInt();
            if(setSign(x,y,sign)){
                showGameStatus();
                break;
            }
            System.out.println("Niepoprawne współrzędne");
        }
    }
}
