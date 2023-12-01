package section_7.t7_22;

import java.util.Arrays;
import java.util.Scanner;

public class MainUser {
    public static int[][] board;
    public static int[] horizontal=new int[]{2,1,-1,-2,-2,-1,1,2};
    public static int[] vertical=new int[]{-1,-2,-2,-1,1,2,2,1};

    public static int currentRow;
    public static int currentColumn;
    public static int score=0;
    public static void main(String[] args) {
        initializeBoard();

        try{
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wprowadz pierwsza liczbe");
            int userInput = scanner.nextInt();
            while(userInput!=9){
                int potentialRow=currentRow+vertical[userInput];
                int potentialColumn=currentColumn+horizontal[userInput];
                if(potentialRow>=0 && potentialRow<=7
                && potentialColumn>=0 && potentialColumn<=7
                        && board[potentialColumn][potentialRow]==0){
                    currentRow+=vertical[userInput];
                    currentColumn+=horizontal[userInput];
                    board[currentRow][currentColumn]++;
                    score++;
                    displayBoard();
                }else{
                    System.out.println("Niepoprawny ruch");
                }
                System.out.println("Wprowadz pierwsza liczbe");
                userInput = scanner.nextInt();
            }
            displayBoard();
        }catch (Exception e){
            e.getStackTrace();
        }

    }

    private static void displayBoard() {
        for (int[] subTable : board) {
            System.out.println(Arrays.toString(subTable));
        }
    }

    private static void initializeBoard() {
        board=new int[8][8];
        for (int[] subTable : board) {
            Arrays.fill(subTable, 0);
        }
        currentRow=0;
        currentColumn=0;
        board[currentRow][currentColumn]=1;
    }
}
