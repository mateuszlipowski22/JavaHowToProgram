package section_17.t_17_21;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
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

        System.out.printf("Suma : %5.2f5%n", Stream.of(gradesArray)
                .flatMap(row -> Arrays.stream(row).mapToObj(element -> Double.parseDouble(String.valueOf(element))))
                .mapToDouble(value -> value)
                .sum());

        System.out.printf("LIczba elementów : %5d%n", Stream.of(gradesArray)
                .flatMap(row -> Arrays.stream(row).mapToObj(element -> Double.parseDouble(String.valueOf(element))))
                .mapToDouble(value -> value)
                .count());

        System.out.printf("Srednia : %5.2f%n", Stream.of(gradesArray)
                .flatMap(row -> Arrays.stream(row).mapToObj(element -> Double.parseDouble(String.valueOf(element))))
                .mapToDouble(value -> value)
                .average()
                .getAsDouble());

            System.out.printf("Srednia : %5.2f%n", Stream.of(gradesArray)
                    .flatMap(row -> Arrays.stream(row).boxed())
                    .mapToDouble(value -> value)
                    .average()
                    .getAsDouble());

    }
}
