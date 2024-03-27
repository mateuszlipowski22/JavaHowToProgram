package section_18.e_18_9;

import java.util.stream.IntStream;

public class FactorialCalculator {
    public static long factorial(long number){
        long result = 1;
        for(long i = number ; i>= 1; i--){
            result*=i;
        }
        return result;
    }

    public static void main(String[] args) {
        int limit = 10;

        IntStream.iterate(0,x->x+1)
                .limit(limit+1)
                .forEach(number -> {
                    System.out.printf("%d! = %d%n",number,factorial(number));
                });

        for(int counter = 0 ;counter<=10;counter++){
            System.out.printf("%d! = %d%n",counter,factorial(counter));
        }
    }
}
