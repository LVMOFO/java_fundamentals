package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
/**
 * Created by Bo Bender 220605@1730
 */
public class BlackjackController {
    public static void main(String[] args) {
        Card deck = new Card();
        //Full deck of 52 cards below
        deck.loadCards();
        Player readyPlayer1 = new Player();
        String returnPlayerName = readyPlayer1.getPlayerName();
        readyPlayer1.setName(returnPlayerName);

    }
}
