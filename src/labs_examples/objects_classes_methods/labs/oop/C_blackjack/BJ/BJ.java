package labs_examples.objects_classes_methods.labs.oop.C_blackjack.BJ;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BJ {
    public static void main(String[] args) {
 /*       //Card cardsCards = new Card();
        //Full deck of 52 cards below
        BJ.loadCards();
        System.out.println(cardsCards.deckOfCards[22]);
        //Create Player
        Player Player1Obj = new Player();
//        String playerName = Player1Obj.getName();
//        System.out.println("Players name is: " + playerName);
        //Go get initial card by calling deal first hand which calls Random Number Generator
        int initialCard = Deck.dealFirstCard();
//        public String[] deckOfCards = new String[52];      protected int[] cardInDeck = new int[52];
//        protected ArrayList<Integer> usedCards;
        System.out.println(Player.getPlayersName() + " your first card is " + cardsCards.deckOfCards[initialCard]);
        System.out.println();
        A
        System.out.println();
    }
    //CARD
    public char[] suit = new char[]{'♣', '♦', '♥', '♠'};
    protected int cardValue;
    protected char[] rank = new char[]{'A','2','3','4','5','6','7','8','9','T','J','Q','K'};
    public String[] deckOfCards = new String[52];
    protected int[] cardInDeck = new int[52];
    public static int holdCard;
    //DECK
    protected Card[] cards; // = new Card[52];
    public ArrayList<Integer> usedCards;
    //HAND
    protected ArrayList<Card> cardsDealt;
    protected int handValue;
    //PLAYER
    protected String name;
    protected Hand hand;
    protected int potValue; //(the amount of money they have)


    public void loadCards(){
        //Card[] cards = new Card[52];
        int i = 0;
        int iSuit = suit.length;
        int iRank = rank.length;
        for (char s : suit) {
            for (char r : rank) {
                deckOfCards[i] = String.valueOf(r) + String.valueOf(s);
                System.out.print(deckOfCards[i] + " ");
                //int m = i % 13;  COMMENT out next 3 later
                if (i == 12 | i == 25 || i == 38 | i == 51) {
                    System.out.println();
                }
                cardInDeck[i] = i;
                i++;
            }
        }
        //return deckOfCards[];
        //System.out.println(Card.toString());
    }
//    public Deck(ArrayList<Integer> usedCards) {
//        this.usedCards = usedCards;
//    }

//    public void addCardToArrayListCard(int addCard){
//        usedCards.add(addCard);
//        System.out.println(usedCards);
//        //return addCard;
    }
    public static int dealFirstCard() {
        int firstCard = getRandomNumber();
        System.out.println("Next line is random number:" + firstCard);
        //Card theHoldCard = new Card();
        BJ.holdCard = firstCard;
        return firstCard;
    }

    public static int getRandomNumber() {
        Random rand = new Random();
        int upperBound = 51;
        int iRandom = rand.nextInt(upperBound);
        return iRandom;
    }

    public static String getPlayersName(){
        //Get player name from prompt
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String sInputName = scanner.next();
        System.out.println("---- Welcome to our game of Blackjack " + sInputName + "!____");
        return sInputName;     */
    }
}
