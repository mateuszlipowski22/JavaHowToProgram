package section_16.e_16_9;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {
    private final int NUMBER_OF_CARDS = 52;
    private List<Card> list;

    public DeckOfCards() {

        Card[] deck = new Card[NUMBER_OF_CARDS];
        int count = 0;

        for(Card.Suit suit : Card.Suit.values()){
            for(Card.Face face : Card.Face.values()){
                deck[count]=new Card(face,suit);
                count++;
            }
        }

        list = Arrays.asList(deck);
        Collections.shuffle(list);
    }

    public void printCards(){
        for(int i = 0; i< list.size(); i++){
            System.out.printf("%-19s%s", list.get(i),
                    ((i+1)%4==0) ? System.lineSeparator() : " ");
        }
    }

    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        deck.printCards();
    }
}