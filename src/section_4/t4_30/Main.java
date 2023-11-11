package section_4.t4_30;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wprowadz długosc boku kwadratu :");
            int width = scanner.nextInt();

            for(int i=0;i<width;i++){
                System.out.printf("*%s*%n",((i==0||i==width-1)?" * ":"   ").repeat(width-2));
            }
        }catch (Exception e){
            e.getStackTrace();
        }
    }
}
