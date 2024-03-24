package section_17.t_17_14;

import java.security.SecureRandom;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        List<Character> charList = random.ints(30, 50, 90)
                .boxed()
                .map(integer -> (char) integer.intValue())
                .toList();

        System.out.printf("Posortowane alfabetycznie: %n");
        charList.stream()
                .sorted(Comparator.naturalOrder())
                .forEach(character -> System.out.printf("%c%n",character));

        System.out.printf("Posortowane w kolejnosci malejącej: %n");
        charList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(character -> System.out.printf("%c%n",character));

        System.out.printf("Posortowane w kolejnosci rosnącej bez duplikatów: %n");
        new HashSet<>(charList)
                .stream()
                .toList()
                .stream()
                .sorted(Comparator.reverseOrder())
                .forEach(character -> System.out.printf("%c%n",character));
    }
}
