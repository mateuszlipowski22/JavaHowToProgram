package section_20.e_20_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TotalNumber {
    public static void main(String[] args) {
        Number[] numbers = {1,2.4,3,4.1};

        List<Number> numberList = new ArrayList<>(Arrays.asList(numbers));

        System.out.printf("numberList zawiera: %s%n",numberList);
        System.out.printf("Suma elementów w numberList: %.1f",sum(numberList));

    }

    private static double sum(List<Number> numberList) {
        return numberList.stream()
                .map(Number::doubleValue)
                .reduce(0d, Double::sum);
    }
}
