package section_4.t4_21;

import java.util.Scanner;

public class FindMax {

    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wprowadz pierwsza liczbe :");
            int number=scanner.nextInt();
            int largest=number;

            for(int counter=1;counter<10;counter++){
                System.out.printf("Wprowadz kolejną (%d) liczbe :%n", counter+1);
                number=scanner.nextInt();

                if(largest<number){
                    largest=number;
                }
            }

            System.out.printf("Najwieksza liczba to %d",largest);

        }catch (Exception e){
            e.getStackTrace();
        }
    }
}
