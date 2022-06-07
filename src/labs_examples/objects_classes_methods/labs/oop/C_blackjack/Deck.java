package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
/**
 * Created by Bo Bender 220605@1744
 */

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    protected Card[] cards = new Card[52];
    protected ArrayList<Integer> usedCards;

    public Deck() {

    }

    public static int dealFirstCard() {
        int firstCard = getRandomNumber();
        System.out.println("Next line is random number:");
        System.out.println(firstCard);
        return firstCard;
    }

    public static int getRandomNumber() {
        Random rand = new Random();
        int upperBound = 51;
        int iRandom = rand.nextInt(upperBound);
        return iRandom;
    }


}
