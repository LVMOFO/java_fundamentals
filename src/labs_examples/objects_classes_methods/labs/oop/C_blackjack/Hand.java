package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Bo Bender 220610@0722
 */
public class Hand extends Deck{
    //(POJO - this will hold Hand data)
    protected ArrayList<Card> cardsDealt;
    protected int handValue;
//CONTRUCTORS
    public Hand(){}

    public Hand(ArrayList<Card> cardsDealt, int handValue) {
        this.cardsDealt = cardsDealt;
        this.handValue = handValue;
    }

    public Hand(Card[] cards, int[] iCard, String[] sCard, ArrayList<Integer> usedCards, ArrayList<Card> cardsDealt, int handValue) {
        super(cards, iCard, sCard, usedCards);
        this.cardsDealt = cardsDealt;
        this.handValue = handValue;
    }

    public Hand(char[] suit, char[] rank, Card[] cards, int[] iCard, String[] sCard, ArrayList<Integer> usedCards, ArrayList<Card> cardsDealt, int handValue) {
        super(suit, rank, cards, iCard, sCard, usedCards);
        this.cardsDealt = cardsDealt;
        this.handValue = handValue;
    }

    public Hand(char[] suit, int cardValue, char[] rank, Card[] cards, int[] iCard, String[] sCard, ArrayList<Integer> usedCards, ArrayList<Card> cardsDealt, int handValue) {
        super(suit, cardValue, rank, cards, iCard, sCard, usedCards);
        this.cardsDealt = cardsDealt;
        this.handValue = handValue;
    }
//END****CONTRUCTORS
    public static int dealFirstCard() {
        System.out.println("***DECK***BEGIN of --> public static int dealFirstCard() ***");
        int firstCard = getRandomNumber();
        System.out.println("Next line is random number:" + firstCard);
        //Check if card is used
        //Give to a player

        Card theHoldCard = new Card();
        theHoldCard.holdCard = firstCard;
        System.out.println("***DECK***END of --> public static int dealFirstCard() ***");
        return firstCard;
    }

    public static int getRandomNumber() {
        System.out.println("***DECK***BEGIN of --> public static int getRandomNumber() ***");
        Random rand = new Random();
        int upperBound = 51;
        int iRandom = rand.nextInt(upperBound);
        System.out.println("***DECK***END of --> public static int getRandomNumber() ***");
        return iRandom;
    }
}
