package labs_examples.objects_classes_methods.labs.oop.C_blackjack.firstAttempt;
/**
 * Created by Bo Bender 220605@1730   !!FIRST ATTEMPT!!
 */

import java.util.ArrayList;


public class BlackjackController {
    public static void main(String[] args) {
        Card cardsCards = new Card();   //Card.java
            //Full deck of 52 cards below
            cardsCards.loadCards();
            System.out.println(cardsCards.deckOfCards[22]);
        //Create Player
        Player Player1Obj = new Player();   //Player.java
//          String playerName = Player1Obj.getName();
//          System.out.println("Players name is: " + playerName);
        //Go get initial card by calling deal first hand which calls Random Number Generator
        int initialCard = Deck.dealFirstCard();   //Deck.java
//        System.out.println("Initial Card = " + initialCard);
//        public String[] deckOfCards = new String[52];      protected int[] cardInDeck = new int[52];
//        protected ArrayList<Integer> usedCards;
        System.out.println(Player.getPlayersName() + " your first card is " + cardsCards.deckOfCards[initialCard]);
        //Will call the make a second call and make you put your name in a second time
//        System.out.println(Player.getPlayersName() + " your first card is " + cardsCards.cardInDeck[initialCard]);
//        System.out.println();
        System.out.println();
//        class A {
//            int a = 10;
//        }
//        public class B{
//            public static void main (String args[]){
//                A a = new A();
//                System.out.println("I live in A " + a.a);
//            }
        ArrayList<Integer> usedCards = new ArrayList<Integer>();
        usedCards.add(initialCard);
//        ArrayList<Integer> usedCards = new ArrayList<Integer>();
//        usedCards.add(initialCard);
        System.out.println(usedCards);


//        Player1Obj.
        //Stuck on below.  Trying to load the card into usedCards ArrayList
//        Deck usedCards = new Deck();
//            usedCards.addCardToArrayListCard(initialCard);


    }
}
