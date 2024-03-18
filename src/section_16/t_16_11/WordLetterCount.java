package section_16.t_16_11;

import java.util.*;

public class WordLetterCount {
    public static void main(String[] args) {
        Map<Character, Integer> myMap = new HashMap<>();

        createMap(myMap);
        displayMap(myMap);

    }

    private static void displayMap(Map<Character, Integer> myMap) {
        Set<Character> keys = myMap.keySet();
        TreeSet<Character> sortedKeys = new TreeSet<>(keys);

        System.out.printf("%nOdwzorowanie zawiera:%nKluczy\t\tWartości%n");

        sortedKeys.forEach(key -> System.out.printf("%-11s%10s%n", key, myMap.get(key)));

        System.out.printf("%nsize: %d%nisEmpty: %b%n", myMap.size(), myMap.isEmpty());
    }

    private static void createMap(Map<Character, Integer> myMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz tekst: ");
        String input = scanner.nextLine();

        List<String> tokens = new ArrayList<>(List.of(input.split(" ")));

        tokens.stream()
                .map(String::toUpperCase)
                .forEach(token -> {
                    token.chars().forEach(letter -> {
                        Character character = (char) letter;
                        if (myMap.containsKey(character)) {
                            myMap.put(character, myMap.get(character) + 1);
                        } else {
                            myMap.put(character, 1);
                        }
                    });
                });
    }


}