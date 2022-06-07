package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
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
public void loadCardsArray(){
    System.out.println("LOADING deck from Deck.java now");
    Card cCard = new Card();
    int i = 0;
    int iSuit = cCard.suit.length;
    int iRank = cCard.rank.length;
    for (char s : cCard.suit) {
        for (char r : cCard.rank) {
            cCard.deckOfCards[i] = String.valueOf(r) + String.valueOf(s);
            System.out.print(cCard.deckOfCards[i] + " ");
            //int m = i % 13;  COMMENT out next 3 later
            if (i == 12 | i == 25 || i == 38 | i == 51) {
                System.out.println();
            }
            cCard.cardInDeck[i] = i;
            i++;
        }
    }
    //return deckOfCards[];
    //System.out.println(Card.toString());
}
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
