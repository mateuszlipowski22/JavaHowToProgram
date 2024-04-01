package section_18.t_18_15;

public class Main2 {
    private static final int N = 8;
    private static int[][] chess = new int[N][N];

    public static void main(String[] args) {
        solveNQueens(1, 0);
        printChess(chess);
    }

    public static boolean solveNQueens(int queen, int column) {
        if (column >= N)
            return true;

        for (int i = 0; i < N; i++) {
            if (isAttacking(chess, i, column)) {
                chess[i][column] = queen;

                if (solveNQueens(queen + 1, column + 1) == true)
                    return true;

                chess[i][column] = 0;
            }
        }

        return false;
    }

    public static boolean isAttacking(int[][] chess, int row, int column) {
        int i, j;

        // check the rows
        for (i = 0; i < N; i++) {
            if (chess[row][i] != 0)
                return false;
        }

        // check the columns
        for (i = 0; i < N; i++) {
            if (chess[i][column] != 0)
                return false;
        }

        // check the diagonals
        // /
        j = column + 1;
        for (i = row - 1; (i >= 0 && j < N); i--, j++) {
            if (chess[i][j] != 0)
                return false;
        }

        j = column - 1;
        for (i = row + 1; (i < N && j >= 0); i++, j--) {
            if (chess[i][j] != 0)
                return false;
        }

        // \
        j = column - 1;
        for (i = row - 1; (i >= 0 && j >= 0); i--, j--) {
            if (chess[i][j] != 0)
                return false;
        }

        j = column + 1;
        for (i = row + 1; (i < N && j < N); i++, j++) {
            if (chess[i][j] != 0)
                return false;
        }

        return true;
    }

    public static void printChess(int[][] chess) {
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess.length; j++)
                System.out.print(" " + chess[i][j] + " ");

            System.out.println();
        }
    }
}
