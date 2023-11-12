package section_4.t4_32;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wprowadz liczbe do konwersji na system dziesiętny :");
            int numberToConvert = scanner.nextInt();

            System.out.printf("%d w systemie dziesietnym to %d",numberToConvert, convertToBinary(numberToConvert));
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public static int convertToBinary(int numberToConvert){
        int result=0;
        int copiedNumber=numberToConvert;

        List<Integer> digits = new ArrayList<>();

        while(copiedNumber >0){
            digits.add(copiedNumber%10);
            copiedNumber=copiedNumber/10;
        }

        for(int i=digits.size(); i>0 ; i--){
            result=result+digits.get(i-1)*(int) Math.pow(2,i-1);
        }

        return result;
    }
}
