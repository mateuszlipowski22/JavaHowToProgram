package section_16.t_16_16;

import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wpisz liczbe do analizy: ");
            Integer number = scanner.nextInt();
            NumberAnalyzer numberAnalyzer = new NumberAnalyzer();
            Set<Integer> factors = numberAnalyzer.getFactors(number);
            System.out.printf("Podzielniki liczby %d to %s%n",number, factors);
            if(factors.size()==1 && Objects.equals(factors.iterator().next(), number)){
                System.out.printf("Liczbay %d jest liczbą pierwsza",number);
            }

        } catch (Exception e) {
            throw new Exception("Bład podczas pobierania danych od klienta", e);
        }
    }
}
