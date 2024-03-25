package section_17.t_17_22;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[][] gradesArray = {
                {87, 96, 70},
                {68, 87, 90},
                {94, 100, 90},
                {100, 81, 82},
                {83, 65, 85},
                {78, 87, 65},
                {85, 75, 83},
                {91, 94, 100},
                {76, 72, 84},
                {87, 93, 73},
        };


        System.out.printf("Suma każdego ucznia to %n");
        Stream.of(gradesArray)
                .map(row -> Arrays.stream(row)
                        .mapToDouble(value -> value)
                        .sum())
                .toList()
                .forEach(sum ->System.out.format("%5.2f%n",sum));

        System.out.printf("Liczba ocen każdego ucznia to %n");
        Stream.of(gradesArray)
                .map(row -> Arrays.stream(row)
                        .mapToDouble(value -> value)
                        .count())
                .toList()
                .forEach(count ->System.out.format("%d%n",count));

        System.out.printf("Średnia każdego ucznia to %n");
        Stream.of(gradesArray)
                .map(row -> Arrays.stream(row)
                        .mapToDouble(value -> value)
                        .average()
                        .getAsDouble())
                .toList()
                .forEach(average ->System.out.format("%5.2f%n",average));
    }
}
