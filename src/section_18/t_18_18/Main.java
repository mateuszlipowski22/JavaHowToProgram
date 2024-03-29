package section_18.t_18_18;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,-5,6,7,8,-3};
        System.out.printf("Minimum tabeli \"%s\" : %d ", Arrays.toString(intArray),recursiveMinimum(intArray));
    }

    public static int recursiveMinimum(int[] table){
        return recursiveMinimum(table, table[0]);
    }

    public static int recursiveMinimum(int[] table, int minimum){
        if(table[0]<minimum){
            minimum=table[0];
        }
        if(table.length>1){
            minimum = recursiveMinimum(Arrays.copyOfRange(table, 1, table.length),minimum);
        }
        return minimum;
    }
}
