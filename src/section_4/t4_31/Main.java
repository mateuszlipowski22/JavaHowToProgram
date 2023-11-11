package section_4.t4_31;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wprowadz liczbe do sprawdzenia czy jest palindromem :");
            int numerToCheck = scanner.nextInt();

            System.out.printf("%d%sjest palindromem",numerToCheck, (isPalindrom(String.valueOf(numerToCheck)) ? " " : " nie 2"));

        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public static boolean isPalindrom(String string){
        return (string.contentEquals((new StringBuilder(string)).reverse()));
    }

}
