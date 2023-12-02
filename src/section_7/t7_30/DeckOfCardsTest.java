package section_7.t7_30;

import java.util.*;

public class DeckOfCardsTest {
    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.shuffle();

        List<List<Card>> game = new ArrayList<>();
        int numberOfPlayers = 4;
        for (int i = 0; i < numberOfPlayers; i++) {
            game.add(new ArrayList<Card>());
        }
        for (int i = 1; i <= numberOfPlayers * 5; i++) {
            game.get(i % 4).add(deckOfCards.dealCard());
        }
        System.out.println(game);
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < game.size(); i++) {
            result.put(i + 1, deckOfCards.score(
                    deckOfCards.decomposeFaces(game.get(i)),
                    deckOfCards.decompositeSuits(game.get(i))
            ));
        }

        Map.Entry<Integer, Integer> maxEntry = Collections.max(result.entrySet(), Map.Entry.comparingByValue());

        System.out.printf("Zwycięzył gracz %d z %d punktami %n", maxEntry.getKey(), maxEntry.getValue());

    }
}
