package section_17.e_17_7;

import java.util.stream.IntStream;

public class StreamFilterMapReduce {
    public static void main(String[] args) {
        System.out.printf("Suma trzykrotnosci liczb parzystych od 2 do 10 wynosi : %d%n",
                IntStream.rangeClosed(1,10)
                        .filter(x->x%2==0)
                        .map(x->x*3)
                        .sum());
    }
}
