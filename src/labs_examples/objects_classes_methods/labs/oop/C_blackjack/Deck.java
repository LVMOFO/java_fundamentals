package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
/**
 * Created by Bo Bender 220605@1744
 */
import java.util.ArrayList;
import java.util.Random;

public class Deck {
    public Card[] cards;
    protected ArrayList<Integer> usedCards;

    //pub

public static int getRandomNumber(){
    Random rand = new Random();
    int upperBound = 51;
    int iRandom = rand.nextInt(upperBound);
    return iRandom;
}


}
