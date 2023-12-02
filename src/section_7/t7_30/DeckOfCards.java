package section_7.t7_30;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeckOfCards {
    private static final SecureRandom secureRandom = new SecureRandom();
    private static final int NUMBER_OF_CARDS = 52;
    private Card[] deck = new Card[NUMBER_OF_CARDS];
    private int currentCard = 0;

    public DeckOfCards() {
        String[] faces = {"As", "Dwókja", "Trójka", "Czwórka", "Piątka", "Szóstka",
                "Siódemka", "Ósemka", "Dziewiątka", "Dziesiątka", "Walet", "Dama", "Król"};
        String[] suits = {"trefl", "karo", "kier", "pik"};

        for (int count = 0; count < deck.length; count++) {
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
        }
    }

    public void shuffle() {
        currentCard = 0;

        for (int first = 0; first < deck.length; first++) {
            int second = secureRandom.nextInt(NUMBER_OF_CARDS);

            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;

        }
    }

    public Card dealCard(){
        if(currentCard<deck.length){
            return deck[currentCard++];
        }else {
            return null;
        }
    }

    public Map<String,Integer> decomposeFaces(List<Card> cards){
        Map<String,Integer> resultFaces = new HashMap<>();
        for(Card card : cards){
            if(resultFaces.containsKey(card.getFace())){
                resultFaces.put(card.getFace(), resultFaces.get(card.getFace())+1);
            }else {
                resultFaces.put(card.getFace(), 1);
            }
        }
        return resultFaces;
    }

    public boolean hasPair(Map<String,Integer> decomposeFaces){
        return decomposeFaces.entrySet().stream().anyMatch(v->v.getValue()==2);
    }
    public boolean hasTwoPair(Map<String,Integer> decomposeFaces){
        boolean result = false;
        int pair=0;
        for(Map.Entry<String, Integer> entry : decomposeFaces.entrySet()){
            if(entry.getValue()==2){
                pair++;
            }
        }

        if(pair==2){
            result=true;
        }
        return result;
    }

    public boolean hasThreeOfAKind(Map<String,Integer> decomposeFaces){
        return decomposeFaces.entrySet().stream().anyMatch(v->v.getValue()==3);
    }

    public boolean hasFourOfAKind(Map<String,Integer> decomposeFaces){
        return decomposeFaces.entrySet().stream().anyMatch(v->v.getValue()==4);
    }

    public boolean hasFlush(Map<String,Integer> decomposeSuits){
        return decomposeSuits.entrySet().stream().anyMatch(v->v.getValue()==5);
    }

    public boolean hasFullHouse(Map<String,Integer> decomposeFaces){
        boolean result = false;
        int fullHouse=0;
        for(Map.Entry<String, Integer> entry : decomposeFaces.entrySet()){
            if(entry.getValue()==2){
                fullHouse=fullHouse+2;
            }
            if(entry.getValue()==3){
                fullHouse=fullHouse+3;
            }
        }

        if(fullHouse==5){
            result=true;
        }
        return result;
    }

    public boolean hasStraightFlush(Map<String,Integer> decomposeFaces,Map<String,Integer> decomposeSuits){
        if(!hasFlush(decomposeSuits)){
            return false;
        }

        return hasStraight(decomposeFaces);
    }

    public boolean hasStraight(Map<String,Integer> decomposeFaces){
        List<String> faces = new ArrayList<>(List.of("As", "Dwókja", "Trójka", "Czwórka", "Piątka", "Szóstka",
                "Siódemka", "Ósemka", "Dziewiątka", "Dziesiątka", "Walet", "Dama", "Król"));
        List<Integer> tempTable= new ArrayList<>();

        boolean result = true;

        for(Map.Entry<String, Integer> entry : decomposeFaces.entrySet()){
            tempTable.add(faces.indexOf(entry.getKey()));
        }

        tempTable.sort(Integer::compareTo);

        for(int i = 0; i<tempTable.size()-1; i++){
            if(tempTable.get(i+1)-tempTable.get(i)!=1){
                return false;
            }
        }
        return result;
    }

    public Map<String,Integer> decompositeSuits(List<Card> cards){
        Map<String,Integer> resultSuits = new HashMap<>();
        for(Card card : cards){
            if(resultSuits.containsKey(card.getSuit())){
                resultSuits.put(card.getSuit(), resultSuits.get(card.getSuit())+1);
            }else {
                resultSuits.put(card.getSuit(), 1);
            }
        }
        return resultSuits;
    }

    public int score(Map<String,Integer> decomposeFaces,Map<String,Integer> decomposeSuits){

        if(hasStraightFlush(decomposeFaces,decomposeSuits)){
            return 8;
        }

        if(hasFourOfAKind(decomposeFaces)){
            return 7;
        }

        if(hasFullHouse(decomposeFaces)){
            return 6;
        }

        if(hasFlush(decomposeSuits)){
            return 5;
        }

        if(hasStraight(decomposeFaces)){
            return 4;
        }

        if(hasThreeOfAKind(decomposeFaces)){
            return 3;
        }

        if(hasTwoPair(decomposeFaces)){
            return 2;
        }

        if(hasPair(decomposeFaces)){
            return 1;
        }

        return 0;
    }
}
