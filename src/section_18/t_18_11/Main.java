package section_18.t_18_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wpisz pierwszą liczbę");
            int first = scanner.nextInt();

            System.out.println("Wpisz druga liczbę");
            int second = scanner.nextInt();

            System.out.printf("Najwiekszy wspólny dzielnik liczba %d oraz %d wynosi %d",first,second, gdc(first,second));

        }catch (Exception e){
            System.err.println("Błąd podczas pobierania danych "+e.getMessage());
        }
    }

    private static int gdc(int first, int second) {
        if(second==0){
            return first;
        }else {
            return gdc(second,first%second);
        }
    }
}
