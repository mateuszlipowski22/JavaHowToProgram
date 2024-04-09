package section_20.e_20_3;

import java.util.Arrays;

public class GenericMethodTest {
    public static void main(String[] args) {
        Integer[] integerArray = {1,2,3,4,5,6,7};
        Long[] longArray = {1L,2L,3L,4L, 5L,6L,7L};
        Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5,6.6,7.7};
        Character[] characterArray = {'W','I','T','A','J'};

        System.out.printf("Tablica integerArray zawiera : ");
        printArray(integerArray);

        System.out.printf("Tablica integerArray zawiera : ");
        printArray(doubleArray);

        System.out.printf("Tablica integerArray zawiera : ");
        printArray(characterArray);

        System.out.printf("Tablica integerArray zawiera : ");
        printArray(longArray);

    }

    private static <T> void printArray(T[] inputArray) {
        Arrays.stream(inputArray)
                .forEach(element-> System.out.printf("%s ",element));
        System.out.println();
    }

}
