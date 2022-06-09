package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
/**
 * Created by Bo Bender 220605@1738
 */
public class Card{
    public char[] suit = new char[]{'♣', '♦', '♥', '♠'};
    protected int cardValue;
    protected char[] rank = new char[]{'A','2','3','4','5','6','7','8','9','T','J','Q','K'};
    public String[] deckOfCards = new String[52];
    public int[] cardInDeck = new int[52];
    protected int holdCard;

    public void callCardsFromCards(){
        System.out.println("***CARDS***BEGIN of --> public void callCardsFromCards() ***");
        Card cCard = new Card();   //Card.java
        System.out.print("Ignore messing around" + cCard.deckOfCards[26] + "-->");     //Ace of Hearts
        System.out.println(cCard.cardInDeck[26]);
        System.out.println("***CARDS***END of --> public void callCardsFromCards() ***");
    }


/*
    public void loadCards(){
        System.out.println("***CARD***BEGIN of --> public void loadCards() ***");
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
        System.out.println("***CARD***END of --> public void loadCards() ***");
    }

 */
}

