package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
/**
 * Created by Bo Bender 220610@0722
 */
import labs_examples.objects_classes_methods.labs.bHoldBJ.Card;
import java.util.ArrayList;


public class Deck extends labs_examples.objects_classes_methods.labs.oop.C_blackjack.Card {
    //(POJO - this will hold deck data)
    protected Card[] cards;
    public int[] iCard = new int[52];
    public String[] sCard = new String[52];
    ArrayList<Integer> usedCards;

    public static loadDeckCardsArray(){
        int i = 0;
        int iSuit = super.suit.length;
        int iRank = super.rank.length;
        for (char s : super.suit) {
            for (char r : super.rank) {
                sCard[i] = String.valueOf(r) + String.valueOf(s);
                System.out.print(sCard[i] + " ");
                //int m = i % 13;  COMMENT out next 3 later
                if (i == 12 | i == 25 || i == 38 | i == 51) {
                    System.out.println();
                }
                iCard[i] = i;
                i++;
            }
        }
    }
}
