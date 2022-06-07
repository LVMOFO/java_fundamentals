package labs_examples.objects_classes_methods.labs.oop.C_blackjack.firstAttempt;
/**
 * Created by Bo Bender 220605@1744
 */

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    protected Card[] cards; // = new Card[52];
    public ArrayList<Integer> usedCards;

//    public Deck() {
//
//    }

//    public Deck(ArrayList<Integer> usedCards) {
//        this.usedCards = usedCards;
//    }

    public void addCardToArrayListCard(int addCard){
        usedCards.add(addCard);
        System.out.println(usedCards);
        //return addCard;
    }
    public void catchUsedCard(int a){
        putCardInUsedCards(a);
    }
    
    public ArrayList<Integer> putCardInUsedCards(int iIncoming){
        ArrayList<Integer> usedCards = new ArrayList<Integer>();
        usedCards.add(iIncoming);
        return usedCards;
    }
//-------------------------------------------------------------------------------------
//    import java.util.ArrayList;
//    public class ClassA {
//        public static void main(String args[])
//        {
//            ClassB m1 = new ClassB();
//            List listInClassA = m1.myNumbers();
//            System.out.println("The List is "+listInClassA);
//        }
//    }
//    public class ClassB {
//        public ArrayList<Integer> myNumbers()    {
//            ArrayList<Integer> numbers = new ArrayList<Integer>();
//            numbers.add(10);
//            numbers.add(15);
//            numbers.add(30);
//            return(numbers);
//        }
//    }
 //-------------------------------------------------------------------------------------
    public static int dealFirstCard() {
        int firstCard = getRandomNumber();
        System.out.println("Next line is random number:" + firstCard);
        Card theHoldCard = new Card();
        theHoldCard.holdCard = firstCard;
        return firstCard;
    }

    public static int getRandomNumber() {
        Random rand = new Random();
        int upperBound = 51;
        int iRandom = rand.nextInt(upperBound);
        return iRandom;
    }


}
