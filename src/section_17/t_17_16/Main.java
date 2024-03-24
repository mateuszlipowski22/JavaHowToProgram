package section_17.t_17_16;

import java.security.SecureRandom;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        random.ints(50, 1, 999)
                .boxed()
                .filter(number->number%2!=0)
                .sorted(Comparator.naturalOrder())
                .forEach(number -> System.out.printf("%d%n",number));

    }
}
