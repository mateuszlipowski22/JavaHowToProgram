package section_20.e_20_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildcardTest {
    public static void main(String[] args) {

        Integer[] integers = {1,2,3,4,5};
        List<Integer> integerList = new ArrayList<>(Arrays.asList(integers));
        System.out.printf("integerList zawiera: %s%n",integerList);
        System.out.printf("Suma elementów w numberList: %.0f%n",sum(integerList));

        Double[] doubles = {1.1,2.2,3.3,4.4};
        List<Double> doubleList = new ArrayList<>(Arrays.asList(doubles));
        System.out.printf("doubleList zawiera: %s%n",doubleList);
        System.out.printf("Suma elementów w numberList: %.1f%n",sum(doubleList));

        Number[] numbers = {1,2.4,3,4.1};
        List<Number> numberList = new ArrayList<>(Arrays.asList(numbers));
        System.out.printf("numberList zawiera: %s%n",numberList);
        System.out.printf("Suma elementów w numberList: %.1f%n",sum(numberList));
    }

    private static double sum(List<? extends Number> numberList) {
        return numberList.stream()
                .map(Number::doubleValue)
                .reduce(0d, Double::sum);
    }
}
