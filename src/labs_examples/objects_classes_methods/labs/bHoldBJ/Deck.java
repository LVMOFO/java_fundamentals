package labs_examples.objects_classes_methods.labs.bHoldBJ;

import java.util.ArrayList;

/**
 * Created by Bo Bender 220609@0711
 */
public class Deck {
    //(POJO - this will hold deck data)
    Card[] cards;
    ArrayList<Integer> usedCards;



    public void loadCardsArray(){
        System.out.println("***DECK***BEGIN of --> public void loadCardsArray() ***");
        System.out.println("LOADING deck from Deck.java now");
        //labs_examples.objects_classes_methods.labs.aHold.BJ.Card cCard = new labs_examples.objects_classes_methods.labs.aHold.BJ.Card();
        Card xCard = new Card();
        int i = 0;
        int iSuit = xCard.suit.length;
        int iRank = xCard.rank.length;
        for (char s : xCard.suit) {
            for (char r : xCard.rank) {
                xCard.deckOfCards[i] = String.valueOf(r) + String.valueOf(s);
                System.out.print(xCard.deckOfCards[i] + " ");
                //int m = i % 13;  COMMENT out next 3 later
                if (i == 12 | i == 25 || i == 38 | i == 51) {
                    System.out.println();
                }
                xCard.theCardInDeck[i] = i;
                i++;
            }
        }
        //return deckOfCards[];
        //System.out.println(Card.toString());
        System.out.println("***DECK***END of --> public void loadCardsArray() ***");
    }
}
