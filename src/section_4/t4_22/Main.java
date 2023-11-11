package section_4.t4_22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wprowadz liczbe :");
            int number=scanner.nextInt();

            System.out.printf("%3s %5s %10s %15s %n", "N", "N*10", "N*100", "N*1000");
            for(int counter=1;counter<=number;counter++){
                System.out.printf("%3d %5d %10d %15d %n", counter, counter*10, counter*100, counter*1000);
            }
        }catch (Exception e){
            e.getStackTrace();
        }
    }
}
