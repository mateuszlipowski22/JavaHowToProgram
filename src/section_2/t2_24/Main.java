package section_2.t2_24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);

            List<Integer> integers = new ArrayList<Integer>();

            for(int i=0 ; i<5 ; i++){
                System.out.print("Podaj liczbe : ");
                integers.add(scanner.nextInt());
            }

            System.out.printf(
                    "Najmniejsza liczba : %d %n" +
                    "Największa liczba : %d %n",
                    integers.stream().min(Integer::compareTo).get(),
                    integers.stream().max(Integer::compareTo).get());

           }catch (Exception e){
            System.out.println("Błąd podczas wykonywania programu -> "+e.getMessage());
        }
    }
}
