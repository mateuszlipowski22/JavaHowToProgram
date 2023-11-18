package section_6.t6_27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wprowadz pierwszą liczbe : ");
            int firstNumber = scanner.nextInt();
            System.out.println("Wprowadz drugą liczbe : ");
            int secondNumber = scanner.nextInt();
            System.out.printf("Największy wspólny dzielnik liczb %d and %d to %d ",
                    firstNumber, secondNumber , gdc(firstNumber, secondNumber) );
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    private static int gdc(int firstNumber, int secondNumber) {
        if(firstNumber%secondNumber==0){
            return secondNumber;
        }else {
           return gdc(secondNumber, firstNumber%secondNumber);
        }
    }
}
