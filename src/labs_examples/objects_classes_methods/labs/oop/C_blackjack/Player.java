package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.Scanner;
/**
 * Created by Bo Bender 220605@1734
 */
public class Player {
    protected String name;
    protected Hand hand;
    protected int potValue; //(the amount of money they have)




    public static String getPlayerName(){
        //Get player name from prompt
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String sInputName = scanner.next();
        System.out.println("----" + sInputName + "____");
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
