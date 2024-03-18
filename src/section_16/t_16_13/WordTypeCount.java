package section_16.t_16_13;

import java.util.*;
import java.util.stream.Collectors;

public class WordTypeCount {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();

        myMap=createMap(myMap);
        displayMap(myMap);

    }

    private static void displayMap(Map<String, Integer> myMap) {
        Set<String> keys = myMap.keySet();
        TreeSet<String> sortedKeys = new TreeSet<>(keys);

        System.out.printf("%nWpisany tekst zawiera poniższe powielenia:%nKluczy\t\tWartości%n");

    }

    private static Map<String, Integer> createMap(Map<String, Integer> myMap) {
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

        return myMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue()>1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}