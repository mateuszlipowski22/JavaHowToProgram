package section_7.t7_29;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe do wyznaczenia silni");
        int number = scanner.nextInt();
        System.out.printf("Silnia z liczby %d wynosi %d %n",number,fibonacci(number));
    }

    public static int fibonacci(int n){
        if(n==1){
            return 1;
        }else {
            return n*fibonacci(n-1);
        }
    }
}
