package section_18.e_18_5;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.Instant;

public class FibonacciCalculator {

    public static BigDecimal fibonacci(BigDecimal number) {
        if (number.equals(BigDecimal.ONE) || number.equals(BigDecimal.ZERO)) {
            return number;
        } else {
            return fibonacci(number.subtract(BigDecimal.ONE)).add(fibonacci(number.subtract(BigDecimal.TWO)));
        }
    }

    public static void main(String[] args) {
        Instant start;
        Instant end;
        long duration;
        for (int counter=0; counter <= 40; counter++) {
            start =  Instant.now();
            System.out.printf("Element %d ciagu Fibonacciego to : %s ", counter, fibonacci(BigDecimal.valueOf(counter)));
            end =  Instant.now();
            duration = Duration.between(start,end).toMillis();
            System.out.printf("czas obliczania to %d [ms]%n", duration);


        }

    }

}
