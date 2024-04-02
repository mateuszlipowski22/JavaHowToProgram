package section_18.t_18_23;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Wpisz liczbę ciagu fibonacciego : ");
            int number = scanner.nextInt();

            try{
                IntStream.iterate(1,x->x+1)
                        .limit(number)
                        .forEach(Main::fibonacciElementWithTime);
            }catch(Exception e){
                System.err.println("Błąd podczas iterowania elementó ciagu \n"+e.getMessage());
            }

        }catch(Exception e){
            System.err.println("Błąd podczas pobierania danych od klienta \n"+e.getMessage());
        }
    }

    public static Double fibonacciElement(int limit) {
        return Stream.iterate(new double[] {0, 1}, t -> new double[] {t[1], t[0] + t[1]})
                .limit(limit)
                .map(element -> element[0])
                .toList()
                .get(limit-1);
    }

    public static void fibonacciElementWithTime(int number){
        try{
            long start = System.nanoTime();
            Double element = fibonacciElement(number);
            long end = System.nanoTime();
            System.out.printf("%d : %.0f - czas wyszukiwania elementu : %d [ns] %n", number, element,end-start);
        }catch(Exception e){
            System.err.println("Błąd w fibonacciElementWithTime \n"+e.getMessage());
        }
    }
}
