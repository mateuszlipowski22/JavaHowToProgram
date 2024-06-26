package section_17.e_17_8;

import java.security.SecureRandom;
import java.util.stream.Collectors;

public class RandomIntegers {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();

        System.out.println("Liczby losowe w osobnych wierszach");
        randomNumbers.ints(10,1,7)
                .forEach(System.out::println);

        String numbers = randomNumbers.ints(10,1,7)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.printf("%nLiczby losowe w jednym wirszu: %s%n", numbers);
    }
}
