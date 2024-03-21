package section_17.e_17_9;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamOperations {
    public static void main(String[] args) {
        int[] values = {3,10,6,1,4,8,2,5,9,7};

        System.out.print("Oryginalne wartości: ");
        System.out.println(IntStream.of(values)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" ")));

        System.out.printf("%nElementów: %d%n",
                IntStream.of(values)
                        .count());
        System.out.printf("Minimum: %d%n",
                IntStream.of(values)
                        .min()
                        .getAsInt());
        System.out.printf("Maksimum: %d%n",
                IntStream.of(values)
                        .max()
                        .getAsInt());
        System.out.printf("Suma: %d%n",
                IntStream.of(values)
                        .sum());
        System.out.printf("Średnia: %f%n",
                IntStream.of(values)
                        .average()
                        .getAsDouble());

        System.out.printf("%nSuma poprzez metode reduce: %d%n",
                IntStream.of(values)
                        .reduce((x,y)->x+y)
                        .getAsInt());
        System.out.printf("Iloczyn poprzez metode reduce: %d%n",
                IntStream.of(values)
                        .reduce((x,y)->x*y)
                        .getAsInt());
        System.out.printf("Suma kwadratów poprzez metode map i sum: %d%n",
                IntStream.of(values)
                        .map(x->x*x)
                        .sum());

        System.out.printf("%nWartości po posortowaniu: %s%n",
                IntStream.of(values)
                        .sorted()
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(" ")));
    }
}
