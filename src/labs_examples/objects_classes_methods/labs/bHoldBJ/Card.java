package labs_examples.objects_classes_methods.labs.bHoldBJ;
/**
 * Created by Bo Bender 220609@0711
 */
public class Card {
    public String[] deckOfCards = new String[52];
    //public String[] theDeckOfCards;
    //(POJO - this will hold card data)
    char[] suit = new char[]{'♠', '♦', '♥', '♣'};
    int cardValue;
    //CREATED two below arrays on my own
    protected char[] rank = new char[]{'A','2','3','4','5','6','7','8','9','T','J','Q','K'};
    public int[] theCardInDeck = new int[52];
    //public int[] cardInDeck = new int[52];

    public Card(){}
    public Card(String[] deckOfCards, char[] suit, int cardValue, char[] rank, int[] theCardInDeck) {
        this.deckOfCards = deckOfCards;
        this.suit = suit;
        this.cardValue = cardValue;
        this.rank = rank;
        this.theCardInDeck = theCardInDeck;
    }

}
