package section_4.t4_37;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ile dlugosc pierwszego boku trójkąta : ");
            int first = scanner.nextInt();
            System.out.println("Ile dlugosc pierwszego boku trójkąta : ");
            int second = scanner.nextInt();
            System.out.println("Ile dlugosc pierwszego boku trójkąta : ");
            int third = scanner.nextInt();

            System.out.printf(isTriangle(first,second,third)?"To moze byc trójkąt prostokatny" : "To nie moze byc trójkąt prostokatny");

        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public static boolean isTriangle(int first, int second, int third){

        if(Math.pow(first,2)==Math.pow(second,2)+Math.pow(third,2)){
            return true;
        }
        if(Math.pow(second,2)==Math.pow(first,2)+Math.pow(third,2)){
            return true;
        }
        if(Math.pow(third,2)==Math.pow(second,2)+Math.pow(first,2)){
            return true;
        }
        return false;
    }
}
