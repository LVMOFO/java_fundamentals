package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
/**
 * Created by Bo Bender 220605@1730
 */
import java.util.ArrayList;


public class BlackjackController {
    public static void main(String[] args) {
        System.out.println("***BLACKJACKCONTROLLER***BEGIN of --> public static void main(String[] args) ***");
        Card cCard = new Card();   //Card.java
        Deck dDeck = new Deck();   //Deck.java
        Player pPlayer = new Player();   //Player.java
        Hand hHand = new Hand();   //Hand.java

        dDeck.loadCardsArray();   //Full deck of 52 cards below
        //cCard.loadCards();   //Full deck of 52 cards below

        //BROKE AFTER HERE AS ITS GIVING NULL VALUES!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        System.out.print("Ignore messing around" + cCard.deckOfCards[26] + "-->");     //Ace of Hearts
        System.out.println(cCard.cardInDeck[26]);
        cCard.callCardsFromCards();
        dDeck.callCardsFromDeck();
        pPlayer.callCardsFromPlayer();
        int initialCard = dDeck.dealFirstCard();   //Deck.java   Go get initial card by calling deal first hand which calls Random Number Generator
        System.out.println(Player.getPlayersName() + " your first card is " + cCard.deckOfCards[initialCard]);
        System.out.println();


/*
        public static int addCardToInventory(int a) {
            ArrayList<Integer> usedCards = new ArrayList<Integer>();
            usedCards.add(a);
//        ArrayList<Integer> usedCards = new ArrayList<Integer>();
//        usedCards.add(initialCard);
            System.out.println(usedCards);
        }

 */

//        Player1Obj.
        //Stuck on below.  Trying to load the card into usedCards ArrayList
//        Deck usedCards = new Deck();
//            usedCards.addCardToArrayListCard(initialCard);



//how to get value from one class to another class in java
//        class A {
//            int a = 10;
//        }
//        public class B{
//            public static void main (String args[]){
//                A a = new A();
//                System.out.println("I live in A " + a.a);
//            }
        System.out.println("***BLACKJACKCONTROLLER***END of --> public static void main(String[] args) ***");
    }

}
