package section_7.t7_30;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

        for(List<Card> playerCards : game){
            Map<String,Integer> faces = deckOfCards.decomposeFaces(playerCards);
            Map<String,Integer> suits = deckOfCards.decompositeSuits(playerCards);
            System.out.printf("Gracz ma pare : %b %n",deckOfCards.hasPair(faces));
            System.out.printf("Gracz ma dwie pary : %b %n",deckOfCards.hasTwoPair(faces));
            System.out.printf("Gracz ma trójka : %b %n",deckOfCards.hasThreeOfAKind(faces));
            System.out.printf("Gracz ma karete : %b %n",deckOfCards.hasFourOfAKind(faces));
            System.out.printf("Gracz ma kolor : %b %n",deckOfCards.hasFlush(suits));
            System.out.printf("Gracz ma poker : %b %n",deckOfCards.hasStraightFlush(faces,suits));
            System.out.printf("Gracz ma house : %b %n",deckOfCards.hasFullHouse(faces));
            System.out.println(faces);
            System.out.println(suits);
        }
    }
}
