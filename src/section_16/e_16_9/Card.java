package section_16.e_16_9;

public class Card {
    public enum Face {As, Dwókja, Trójka, Czwórka, Piątka, Szóstka,
            Siódemka, Ósemka, Dziewiątka, Dziesiątka, Walet, Dama, Król};
    public enum Suit  {trefl, karo, kier, pik};
    private final Face face;
    private final Suit suit;

    public Card(Face face, Suit suit) {
        this.face = face;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return String.format("%s %s", face, suit);
    }
}