package section_20.t_20_5;

import java.util.Arrays;
import java.util.stream.IntStream;

public class GenericMethodTest {
    public static void main(String[] args) {
        Integer[] integerArray = {1, 2, 3, 4, 5, 6, 7};
        Long[] longArray = {1L, 2L, 3L, 4L, 5L, 6L, 7L};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'W', 'I', 'T', 'A', 'J'};

        System.out.printf("Tablica integerArray zawiera : ");
        printArray(integerArray,1,1);

        System.out.printf("Tablica integerArray zawiera : ");
        printArray(doubleArray,1,2);

        System.out.printf("Tablica integerArray zawiera : ");
        printArray(characterArray,1,3);

        System.out.printf("Tablica integerArray zawiera : ");
        printArray(longArray,2,4);

    }

    private static <T> void printArray(T[] inputArray) {
        Arrays.stream(inputArray)
                .forEach(element -> System.out.printf("%s ", element));
        System.out.println();
    }

    private static <T> void printArray(T[] inputArray, int lowSubscription, int highSubscription) {
        IntStream.iterate(lowSubscription, x -> x + 1)
                .limit(highSubscription)
                .mapToObj(index -> inputArray[index])
                .forEach(element -> System.out.printf("%s ", element));

        System.out.println();
    }

}
