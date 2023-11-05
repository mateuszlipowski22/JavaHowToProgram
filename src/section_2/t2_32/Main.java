package section_2.t2_32;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int number;
            boolean flag = true;
            List<Integer> positive = new ArrayList<>();
            List<Integer> negative = new ArrayList<>();
            List<Integer> zero = new ArrayList<>();

            while(flag){
                System.out.print("Podaj liczbe : ");
                if(scanner.hasNextInt()){
                    number = scanner.nextInt();
                    if(number>0){
                        positive.add(number);
                    }else if(number<0){
                        negative.add(number);
                    }else {
                        zero.add(0);
                    }
                }else {
                    flag=false;
                }
            }


            System.out.printf("Liczb pozytywnych : %5d %n",positive.size());
            System.out.printf("Liczb negatywnych : %5d %n",negative.size());
            System.out.printf("Liczb zer : %5d %n",zero.size());

        } catch (Exception e) {
            System.out.println("Błąd podczas wykonywania programu -> " + e.getMessage());
        }
    }
}
