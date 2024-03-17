package section_16.e_16_16;

import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {
    public static void main(String[] args) {
        String[] colors = {"czerwony", "biały", "niebieski","zielony","szary","pomaranczowy",
                "brazowy","biały","czarny","żółty","szary","pomaranczowy","różowy"};

        SortedSet<String> tree = new TreeSet<>(List.of(colors));

        System.out.print("Posortowany zbiór: ");
        printSet(tree);

        tree.add("fioletowy");
        System.out.print("Posortowany zbiór: ");
        printSet(tree);

        System.out.println("headSet (\"pomaranczowy\"): ");
        printSet(tree.headSet("pomaranczowy"));

        System.out.println("tailSet (\"pomaranczowy\"): ");
        printSet(tree.tailSet("pomaranczowy"));

        System.out.printf("Pierwszy: %s%n",tree.first());
        System.out.printf("Ostatni: %s%n",tree.last());
    }

    private static void printSet(SortedSet<String> tree) {
        tree.forEach(element -> System.out.printf("%s ",element));
        System.out.println();
    }
}
