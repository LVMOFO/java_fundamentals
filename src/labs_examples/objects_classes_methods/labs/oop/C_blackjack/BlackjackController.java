package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
/**
 * Created by Bo Bender 220605@1730
 */
public class BlackjackController {
    public static void main(String[] args) {
        Card deck = new Card();
    //Full deck of 52 cards below
        deck.loadCards();
        System.out.println(deck.deckOfCards[22]);
    //Create Player
        Player readyPlayer1 = new Player();
        String returnPlayerName = readyPlayer1.getName();
        System.out.println("Players name is: " + returnPlayerName);
    //Go get initial card by calling deal first hand which calls Random Number Generator
        int initialCard = Deck.dealFirstCard();
        System.out.println(Player.getPlayerName() + " card is " + deck.deckOfCards[initialCard]);
        System.out.println();
    }
}
