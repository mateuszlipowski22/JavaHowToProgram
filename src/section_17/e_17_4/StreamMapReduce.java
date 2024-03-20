package section_17.e_17_4;

import java.util.stream.IntStream;

public class StreamMapReduce {
    public static void main(String[] args) {
        System.out.printf("Suma liczb parzystych od 2 do 20 wynosi : %d%n",
                IntStream.rangeClosed(1,10)
                        .map(x->x*2)
                        .sum());
    }
}
