package section_17.t_17_18;

import java.util.stream.IntStream;

public class StreamMapReduce {
    public static void main(String[] args) {
        System.out.printf("Suma trzykrotnosci liczb parzystych od 2 do 10 wynosi : %d%n",
                IntStream.rangeClosed(1, 10)
                        .map(x -> x % 2 == 0 ? x * 3 : 0)
                        .sum());
    }
}
