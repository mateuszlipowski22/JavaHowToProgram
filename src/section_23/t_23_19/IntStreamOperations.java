package section_23.t_23_19;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamOperations {
    public static void main(String[] args) {
        int[] values = {3,10,6,1,4,8,2,5,9,7};

        System.out.print("Oryginalne wartości: ");
        System.out.println(IntStream.of(values)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" ")));

        System.out.printf("Suma kwadratów poprzez metode map i sum: %d%n",
                IntStream.of(values)
                        .map(x->x*x)
                        .sum());

        System.out.printf("Suma kwadratów poprzez metode reduce na strumieniu rownoległym : %d%n",
                IntStream.of(values).parallel()
                        .reduce((x,y)->x+y*y).getAsInt());
    }
}
