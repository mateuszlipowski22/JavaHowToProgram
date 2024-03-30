package section_18.t_18_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static boolean[][] table = new boolean[8][8];

    public static void main(String[] args) {
        for (boolean[] raw : table) {
            Arrays.fill(raw, false);
        }

        table[0][0] = true;
        checkIfAvailable(1, 1);
    }

    public static void checkIfAvailable(int column, int row) {
        if (column >= table.length || row >= table.length || column < 0 || row < 0) {
            return;
        }

        if (!checkIfRowContainsTrue(column)) {
            checkIfAvailable(column + 1, row);
        }

        if (!checkIfColumnContainsTrue(row)) {
            checkIfAvailable(column, row + 1);
        }

        if (!checkIfDiagonalContainsTrue(column, row)) {
            return;
        }

        table[column][row] = true;
        printArray();
        checkIfAvailable(column + 1, row);
        checkIfAvailable(column, row + 1);
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

        for (int i = 0; i < 8; i++) {
            if (table[column + i][row + i] ||
                table[column + i][row - i] ||
                table[column - i][row - i] ||
                table[column - i][row + i]
            ) {
                return false;
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
