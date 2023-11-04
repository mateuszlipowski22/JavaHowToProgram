package section_2.t2_17;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);

            int[] list = new int[3];

            System.out.print("Podaj pierwsza liczbe : ");
            int first = scanner.nextInt();
            list[0]=first;
            System.out.print("Podaj druga liczbe : ");
            int second = scanner.nextInt();
            list[1]=second;
            System.out.print("Podaj trzecia liczbe : ");
            int third = scanner.nextInt();
            list[2]=third;

            System.out.printf("Pierwsza liczba : %d %n" +
                    "Druga liczba : %d %n" +
                    "Trzecia liczba : %d %n" +
                    "Wynik dodwania : %d %n" +
                    "Wynik srednia : %d %n" +
                    "Wynik mnozenia : %d %n" +
                    "Najmniejsza liczba : %d %n" +
                    "Największa liczba : %d %n",
                    first, second, third,
                    first+second+third,
                    Arrays.stream(list).sum()/ list.length,
                    first*second*third,
                    Arrays.stream(list).min().getAsInt(),
                    Arrays.stream(list).max().getAsInt());
           }catch (Exception e){
            System.out.println("Błąd podczas wykonywania programu -> "+e.getMessage());
        }
    }
}
