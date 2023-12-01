package section_7.t7_22;

import java.security.SecureRandom;
import java.util.Arrays;

public class MainSimulation {
    public static int[][] board;
    public static int[] horizontal = new int[]{2, 1, -1, -2, -2, -1, 1, 2};
    public static int[] vertical = new int[]{-1, -2, -2, -1, 1, 2, 2, 1};

    public static int currentRow;
    public static int currentColumn;

    public static void main(String[] args) {
        initializeBoard();
        SecureRandom random = new SecureRandom();

        int[] moves = new int[8];
        int simulation;
        while (true) {
            Arrays.fill(moves,-1);
            int limit=0;

            int i = 0;
            while (true) {
                simulation = random.nextInt(8);
                int finalSimulation = simulation;
                if (Arrays.stream(moves).anyMatch(value -> value == finalSimulation)){
                    break;
                }

                if(moves[7]!=-1){
                    break;
                }

                int potentialRow = currentRow + vertical[simulation];
                int potentialColumn = currentColumn + horizontal[simulation];
                if (potentialRow >= 0 && potentialRow <= 7
                        && potentialColumn >= 0 && potentialColumn <= 7
                        && board[potentialColumn][potentialRow] == 0) {
                    currentRow = potentialRow;
                    currentColumn =potentialColumn;
                    board[currentRow][currentColumn]=1;
                }
                limit++;
                moves[i]=simulation;
                i++;
            }
            if(limit==8){
                break;
            }
        }
        displayBoard();
        System.out.println("Twoj wynik to : "+countScore());
    }

    private static void displayBoard() {
        System.out.println();
        for (int[] subTable : board) {
            for (int element : subTable){
                System.out.printf("%4d ", element);
            }
            System.out.println();
        }
    }

    private static void initializeBoard() {
        board = new int[8][8];
        for (int[] subTable : board) {
            Arrays.fill(subTable, 0);
        }
        currentRow = 0;
        currentColumn = 0;
        board[currentRow][currentColumn] = 1;
    }

    private static int countScore(){
        int score=0;
        for (int[] subTable : board) {
            for (int element : subTable){
                score+=element;
            }
        }
        return score;
    }
}
