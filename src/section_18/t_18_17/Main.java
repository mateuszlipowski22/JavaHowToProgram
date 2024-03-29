package section_18.t_18_17;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String word = "damy rade";
        stringReverse(word.toCharArray());
    }

    public static void stringReverse(char[] stringArray){
        if(stringArray.length>1){
            System.out.printf("%s", stringArray[stringArray.length-1]);
            stringReverse(Arrays.copyOfRange(stringArray, 0, stringArray.length-1));
        }else {
            System.out.printf("%s", stringArray[0]);
        }
    }
}
