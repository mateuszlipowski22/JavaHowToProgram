package section_18.t_18_28;

import java.math.BigDecimal;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class FactorialCalculatorLambda {

    public static void main(String[] args) {

        for(int counter = 0; counter <=50 ; counter++){
            System.out.printf("%d! = %d%n",counter, LongStream.iterate(1, x -> x + 1)
                    .limit(counter)
                    .reduce(1, (a, b) -> a * b));        }

    }
}
