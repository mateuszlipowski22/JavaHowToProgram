package section_16.e_16_17;

import java.util.*;

public class WordTypeCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz tekst: ");
        String input = scanner.nextLine();

        SortedSet<String> tokens = new TreeSet<>(Arrays.asList(input.split(" ")));
//        SortedSet<String> tokens = new TreeSet<>(Comparator.reverseOrder());
//        tokens.addAll(Arrays.asList(input.split(" "));

        System.out.printf("Posortowany tekst w odwrotnej kolejnosci alfabetycznej : %s",tokens);
    }
}
