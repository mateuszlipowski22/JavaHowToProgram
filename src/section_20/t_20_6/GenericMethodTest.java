package section_20.t_20_6;

import java.util.Arrays;
import java.util.stream.IntStream;

public class GenericMethodTest {
    public static void main(String[] args) {
        Integer[] integerArray = {1,2,3,4,5,6,7};
        Long[] longArray = {1L,2L,3L,4L, 5L,6L,7L};
        Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5,6.6,7.7};
        Character[] characterArray = {'W','I','T','A','J'};
        String[] stringArray = {"jeden","dwa","trzy","cztery","piec","szesc","siedem","osiem"};

        System.out.printf("Tablica integerArray zawiera : ");
        printArray(integerArray);

        System.out.printf("Tablica integerArray zawiera : ");
        printArray(doubleArray);

        System.out.printf("Tablica integerArray zawiera : ");
        printArray(characterArray);

        System.out.printf("Tablica integerArray zawiera : ");
        printArray(longArray);

        System.out.printf("Tablica stringArray zawiera : ");
        printArray(stringArray);
    }

    private static <T> void printArray(T[] inputArray) {
        Arrays.stream(inputArray)
                .forEach(element-> System.out.printf("%s ",element));
        System.out.println();
    }

    private static void printArray(String[] inputArray) {
        System.out.println();
        IntStream.iterate(0, x -> x + 1)
                .limit(inputArray.length)
                .forEach(index -> {
                    System.out.printf("%-10s ", inputArray[index]);
                    if((index+1)%4==0){
                        System.out.println();
                    }
                });
        System.out.println();
    }

}
