package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
/**
 * Created by Bo Bender 220610@0722
 */
import java.util.ArrayList;


public class Deck extends Card {
    //(POJO - this will hold deck data)
    protected Card[] cards;
    protected int[] iCard = new int[52];
    protected String[] sCard = new String[52];
    ArrayList<Integer> usedCards;

   public Deck(){}

    public Deck(suit, cardValue, rank, Card[] cards, int[] iCard, String[] sCard, ArrayList<Integer> usedCards) {
        super.suit = suit;
        super.cardValue = cardValue;
        super.rank = rank;
        this.cards = cards;
        this.iCard = iCard;
        this.sCard = sCard;
        this.usedCards = usedCards;
    }

    public Deck(char[] suit, char[] rank, Card[] cards, int[] iCard, String[] sCard, ArrayList<Integer> usedCards) {
        super(suit, rank);
        this.cards = cards;
        this.iCard = iCard;
        this.sCard = sCard;
        this.usedCards = usedCards;
    }

    public Deck(char[] suit, int cardValue, char[] rank, Card[] cards, int[] iCard, String[] sCard, ArrayList<Integer> usedCards) {
        super(suit, cardValue, rank);
        this.cards = cards;
        this.iCard = iCard;
        this.sCard = sCard;
        this.usedCards = usedCards;
    }

    public void loadDeckCardsArray(){
        int i = 0;
        int iSuit = super.suit.length;
        int iRank = super.rank.length;
        for (char s : super.suit) {
            for (char r : super.rank) {
                sCard[i] = String.valueOf(r) + String.valueOf(s);
                System.out.print(sCard[i] + " ");
                //int m = i % 13;  COMMENT out next 3 later
                if (i == 12 | i == 25 || i == 38 | i == 51) {
                    System.out.println();
                }
                iCard[i] = i;
                i++;
            }
        }
    }
}
