package section_16.e_16_15;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        String[] colors = {"czerwony", "biały", "niebieski","zielony","szary","pomaranczowy",
                "brazowy","biały","czarny","żółty","szary","pomaranczowy","różowy"};

        List<String> list = Arrays.asList(colors);

        System.out.printf("Lista: %s%n",list);

        printNonDuplicates(list);
    }

    private static void printNonDuplicates(Collection<String> collection) {
        Set<String> set = new HashSet<>(collection);
        System.out.printf("%nPo usunięciu duplikatów ");
        set.forEach(value -> System.out.printf("%s ",value));
    }
}
