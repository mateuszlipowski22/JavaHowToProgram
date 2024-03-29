package section_18.t_18_16;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] intArray = {1,2,3,4,5,6,7,8};
        printArray(intArray);
    }

    public static void printArray(int[] table){
        if(table.length>1){
            System.out.printf("%d, ", table[0]);
            printArray(Arrays.copyOfRange(table, 1, table.length));
        }else {
            System.out.printf("%d", table[0]);
        }
    }
}
