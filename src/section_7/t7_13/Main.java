package section_7.t7_13;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] sales = new int[3][5];

        int i=0;
        for(int row = 0; row<sales.length; row++){
            for(int col = 0; col<sales[row].length; col++){
                sales[row][col]=i;
                i++;
            }
        }

        System.out.println(Arrays.deepToString(sales));
    }
}
