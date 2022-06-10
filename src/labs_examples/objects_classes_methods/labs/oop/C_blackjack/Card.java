package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
/**
 * Created by Bo Bender 220610@0722
 */
public class Card {
    //(POJO - this will hold card data)
    protected char[] suit = new char[]{'♠', '♦', '♥', '♣'};
    protected int cardValue;
    //CREATED two below arrays on my own
    protected char[] rank = new char[]{'A','2','3','4','5','6','7','8','9','T','J','Q','K'};
    //public int[] theCardInDeck = new int[52];
    //public int[] cardInDeck = new int[52];
   // protected String[] deckOfCards = new String[52];

    public Card(){}
    public Card(char[] suit, char[] rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Card(char[] suit, int cardValue, char[] rank) {
        this.suit = suit;
        this.cardValue = cardValue;
        this.rank = rank;
    }

    public char[] getSuit() {
        return suit;
    }

    public void setSuit(char[] suit) {
        this.suit = suit;
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    public char[] getRank() {
        return rank;
    }

    public void setRank(char[] rank) {
        this.rank = rank;
    }
}
