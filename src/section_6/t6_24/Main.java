package section_6.t6_24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wprowadz granice :");
            int limit = scanner.nextInt();

            for (int i = 2 ; i<=limit ; i++){
                if(isPerfect(i)){
                    System.out.printf("Liczba %d jest doskonała %n",i);
                }
            }

        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    private static boolean isPerfect(int number) {
        int sum = 1;
        int i = 2;
        while(i<=number/2){
            if(number%i==0){
                sum=sum+i;
            }
            i++;
        }
        return sum==number;
    }
}
