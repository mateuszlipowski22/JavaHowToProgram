package section_2.t2_16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try{
            Scanner scanner = new Scanner(System.in);

            System.out.print("Podaj pierwsza liczbe : ");
            int first = scanner.nextInt();
            System.out.print("Podaj druga liczbe : ");
            int second = scanner.nextInt();

            if(first>second){
                System.out.println("Pierwsza liczba jest wieksza niz druga");
            }else if(first<second){
                System.out.println("Druga liczba jest wieksza niz pierwsza");
            }else {
                System.out.println("Liczby sa równe");
            }

           }catch (Exception e){
            System.out.println("Błąd podczas wykonywania programu -> "+e.getMessage());
        }
    }
}
