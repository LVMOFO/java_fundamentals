package labs_examples.objects_classes_methods.labs.aHold.BJ;
import java.util.Scanner;
/**
 * Created by Bo Bender 220605@1734
 */
public class Player {
    protected String name;
    protected Hand hand;
    protected int potValue; //(the amount of money they have)



    public void callCardsFromPlayer(){
        System.out.println("***PLAYER***BEGIN of --> public void callCardsFromCards() ***");
        Card cCard = new Card();   //Card.java
        System.out.print("Ignore messing around" + cCard.deckOfCards[26] + "-->");     //Ace of Hearts
        System.out.println(cCard.cardInDeck[26]);
        System.out.println("***PLAYER***END of --> public void callCardsFromCards() ***");
    }
    public static String getPlayersName(){
        System.out.println("***PLAYER***BEGIN of --> public static String getPlayersName() ***");
        //Get player name from prompt
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String sInputName = scanner.next();
        System.out.println("---- Welcome to our game of Blackjack " + sInputName + "!____");
        System.out.println("***PLAYER***END of --> public static String getPlayersName() ***");
        return sInputName;
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public int getPotValue() {
        return potValue;
    }

    public void setPotValue(int potValue) {
        this.potValue = potValue;
    }
}
