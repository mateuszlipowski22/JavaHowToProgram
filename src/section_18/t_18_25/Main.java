package section_18.t_18_25;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Wpisz liczbę : ");
            int number = scanner.nextInt();

            System.out.printf("%d : %s%n", number, fibonacciElement(number));
            System.out.printf("%d : %s%n", number, fibonacci(number));
        }catch(Exception e){
            System.err.println("Błąd podczas pobierania danych od klienta \n"+e.getMessage());
        }
    }

    public static List<Integer> fibonacci(int limit) {
        return Stream.iterate(new int[] {0, 1}, t -> new int[] {t[1], t[0] + t[1]})
                .limit(limit)
                .map(element -> element[0])
                .collect(Collectors.toList());
    }

    public static Integer fibonacciElement(int limit) {
        return Stream.iterate(new int[] {0, 1}, t -> new int[] {t[1], t[0] + t[1]})
                .limit(limit)
                .map(element -> element[0])
                .toList()
                .get(limit-1);
    }
}
