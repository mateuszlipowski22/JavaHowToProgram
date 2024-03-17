package section_16.e_16_17;

import java.util.*;

public class WordTypeCount {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();

        createMap(myMap);
        displayMap(myMap);

    }

    private static void displayMap(Map<String, Integer> myMap) {
        Set<String> keys = myMap.keySet();
        TreeSet<String> sortedKeys = new TreeSet<>(keys);

        System.out.printf("%nOdwzorowanie zawiera:%nKluczy\t\tWartości%n");

        sortedKeys.forEach(key -> System.out.printf("%-11s%10s%n",key, myMap.get(key)));

        System.out.printf("%nsize: %d%nisEmpty: %b%n",myMap.size(),myMap.isEmpty());
    }

    private static void createMap(Map<String, Integer> myMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz tekst: ");
        String input = scanner.nextLine();

        List<String> tokens = new ArrayList<>(List.of(input.split(" ")));

        tokens.stream()
                .map(String::toLowerCase)
                .forEach(token -> {
                    if (myMap.containsKey(token)) {
                        myMap.put(token, myMap.get(token) + 1);
                    } else {
                        myMap.put(token, 1);
                    }
                });
    }


}
