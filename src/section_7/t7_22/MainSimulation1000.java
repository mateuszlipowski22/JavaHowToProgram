package section_7.t7_22;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MainSimulation1000 {
    public static int[][] board;
    public static int[] horizontal = new int[]{2, 1, -1, -2, -2, -1, 1, 2};
    public static int[] vertical = new int[]{-1, -2, -2, -1, 1, 2, 2, 1};

    public static int currentRow;
    public static int currentColumn;

    public static void main(String[] args) {
        Map<Integer,Integer> result = new HashMap<>();
        int numberOfGames=100000;
        int score;
        for (int i = 0; i <numberOfGames ; i++) {
            score=play();
            if (result.containsKey(score)){
                result.put(score,result.get(score)+1);
            }else {
                result.put(score,1);
            }
        }
        displayResult(result,numberOfGames);
    }

    private static void displayResult(Map<Integer,Integer> result, int numberOfGames) {
        System.out.println("Wyniki z "+numberOfGames+" gier");
        result.forEach((key, value) -> System.out.printf("%3d : %3d %n", key, value));
    }

    private static int play() {
        initializeBoard();
        Random random = new Random();

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
        return countScore();
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
