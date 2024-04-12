package section_20.t_20_4;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.stream.IntStream;

public class SelectionSortTest {
    public static <T extends Comparable<T>> void selectionSort(T[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int smallest = i;

            for (int index = i + 1; index < data.length; index++) {
                if (data[index].compareTo(data[smallest]) < 0) {
                    smallest = index;
                }

            }
            swap(data, i, smallest);
            printPass(data, i + 1, smallest);
        }
    }

    private static <T> void printPass(T[] data, int pass, int index) {
        System.out.printf("Po przebiegu %2d: ", pass);

        IntStream.iterate(0, x -> x + 1)
                .limit(index)
                .forEach(element -> System.out.printf("%s ", data[element]));

        System.out.printf("%s* ", data[index]);

        for (int i = index + 1; i < data.length; i++) {
            System.out.printf("%s ", data[i]);
        }

        System.out.printf("%n                 ");

        IntStream.iterate(0, x -> x + 1)
                .limit(pass)
                .forEach(element -> System.out.printf("-- "));

        System.out.println();
    }

    private static <T> void swap(T[] data, int first, int second) {
        T temporary = data[first];
        data[first] = data[second];
        data[second] = temporary;
    }

    public static void main(String[] args) {
        SecureRandom generator = new SecureRandom();
        Double[] data = generator.doubles(10, 10.0, 100.0)
                .boxed()
                .toArray(Double[]::new);

        System.out.printf("Tablica nieposortowana: %s%n%n", Arrays.toString(data));
        selectionSort(data);
        System.out.printf("Tablica posortowana: %s%n%n", Arrays.toString(data));

        Integer[] data2 = generator.ints(10, 10, 100)
                .boxed().toArray(Integer[]::new);

        System.out.printf("Tablica nieposortowana: %s%n%n", Arrays.toString(data2));
        selectionSort(data2);
        System.out.printf("Tablica posortowana: %s%n%n", Arrays.toString(data2));
    }
}
