package section_18.e_18_4;

import java.math.BigDecimal;

public class FactorialCalculator {
    public static BigDecimal factorial(BigDecimal number) {
        if(number.compareTo(BigDecimal.ONE)<=0){
            return BigDecimal.ONE;
        }else {
            return number.multiply(factorial(number.subtract(BigDecimal.ONE)));
        }
    }

    public static void main(String[] args) {
        for(int counter = 0; counter <=50 ; counter++){
            System.out.printf("%d! = %s%n", counter, factorial(BigDecimal.valueOf(counter)).toString());
        }
    }
}
