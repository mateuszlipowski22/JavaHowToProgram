package section_18.t_18_15;

import java.util.Arrays;

public class Main {
    private static int ARRAY_SIZE = 8;
    private static boolean[][] table = new boolean[ARRAY_SIZE][ARRAY_SIZE];


    public static void main(String[] args) {
        for (boolean[] raw : table) {
            Arrays.fill(raw, false);
        }

        table[0][0] = true;
        checkIfAvailable(0, 0);
    }

    public static void checkIfAvailable(int column, int row) {
        if (column == table.length-1 && row == table.length-1) {
            return;
        }

        if (column >= table.length) {
            checkIfAvailable(0,row+1);
        }

        if (row >= table.length) {
           return;
        }

        if (!checkIfColumnContainsTrue(row)) {
            checkIfAvailable(column+1, row);
        }

        if (!checkIfRowContainsTrue(column)) {
            checkIfAvailable(column+1, row);
        }

        if (!checkIfDiagonalContainsTrue(column, row)) {
            checkIfAvailable(column+1, row);
        }else {
            table[column][row]=true;
        }

        System.out.println();
        printArray();

        checkIfAvailable(column+1, row);
    }

    public static boolean checkIfRowContainsTrue(int row) {
        boolean[] tempArray = table[row];
        for (boolean b : tempArray) {
            if (b) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkIfColumnContainsTrue(int column) {
        for (boolean[] b : table) {
            if (b[column]) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkIfDiagonalContainsTrue(int column, int row) {

        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (column + i < ARRAY_SIZE && row + i < ARRAY_SIZE &&
                    column + i >= 0 && row + i >= 0) {
                if (table[column + i][row + i]) {
                    return false;
                }
            }

            if (column + i < ARRAY_SIZE && row - i < ARRAY_SIZE &&
                    column + i >= 0 && row - i >= 0) {
                if (table[column + i][row - i]) {
                    return false;
                }
            }

            if (column - i < ARRAY_SIZE && row - i < ARRAY_SIZE &&
                    column - i >= 0 && row - i >= 0) {
                if (table[column - i][row - i]) {
                    return false;
                }
            }

            if (column - i < ARRAY_SIZE && row + i < ARRAY_SIZE &&
                    column - i >= 0 && row + i >= 0) {
                if (table[column - i][row + i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printArray() {
        for (boolean[] row : table) {
            System.out.println(Arrays.toString(row));
        }
    }
}
