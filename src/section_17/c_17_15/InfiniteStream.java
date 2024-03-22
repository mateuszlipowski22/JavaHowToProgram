package section_17.c_17_15;

import java.security.SecureRandom;
import java.util.stream.IntStream;

public class InfiniteStream {
    public static void main(String[] args) {
        IntStream.iterate(1,x->x+1)
                .limit(10)
                .forEach(System.out::println);


        System.out.printf("%nSuma kwadratów pierwszytch 10 liczb : %d%n",
                IntStream.iterate(1, x->x+1)
                        .map(x->x*x)
                        .limit(10)
                        .sum());

        SecureRandom random = new SecureRandom();
        IntStream.generate(()->random.nextInt())
                .limit(10)
                .forEach(System.out::println);

        random.ints()
                .limit(10)
                .forEach(System.out::println);
    }
}
