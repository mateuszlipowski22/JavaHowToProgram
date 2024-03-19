package section_17.e_17_3;

import java.util.stream.IntStream;

public class StreamReduce {
    public static void main(String[] args) {
        System.out.printf("Suma liczb od 1 do 10 wynosi: %d%n",
                IntStream.rangeClosed(1,10)
                        .sum());
    }
}
