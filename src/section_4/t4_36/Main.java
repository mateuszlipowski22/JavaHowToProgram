package section_4.t4_36;

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

            System.out.printf(isTriangle(first,second,third)?"To moze byc trójkąt" : "To nie moze byc trójkąt");

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    public static boolean isTriangle(int first, int second, int third){
        boolean result = true;
        if(first>second+third){
            result =false;
        }
        if(second>first+third){
            result =false;
        }
        if(third>second+first){
            result =false;
        }
        return result;
    }

//    public static boolean isTriangle(int first, int second, int third){
//        boolean result = true;
//        if(Math.pow(first,2)<Math.pow(second,2)+Math.pow(third,2)){
//            result =false;
//        }
//        if(Math.pow(second,2)<Math.pow(first,2)+Math.pow(third,2)){
//            result =false;
//        }
//        if(Math.pow(third,2)<Math.pow(second,2)+Math.pow(first,2)){
//            result =false;
//        }
//        return result;
//    }
}
