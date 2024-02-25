package section_14.example_14_18;

import java.util.Arrays;
import java.util.Scanner;

public class TokenTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz zdanie i naciśnij Enter");

        String sentence = scanner.nextLine();

        String[] tokens = sentence.split(" ");
        System.out.printf("Liczba elementów: %d%nTokenami są:%n,t",tokens.length);

        Arrays.stream(tokens).forEach(System.out::println);
    }
}
