package labs_examples.objects_classes_methods.labs.bHoldBJ;

/**
 * Created by Bo Bender 220609@0711
 */
public class BlackjackController {
    public static void main(String[] args) {
        System.out.println("***BLACKJACKCONTROLLER***BEGIN of --> public static void main(String[] args) ***");
        Card xCard = new Card();   //Card.java
        Deck dDeck = new Deck();   //Deck.java
        dDeck.loadCardsArray();   //Full deck of 52 cards below


//        //cCard.loadCards();   //Full deck of 52 cards below
//
//        //BROKE AFTER HERE AS ITS GIVING NULL VALUES!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//
        System.out.print("Ignore messing around" + xCard.deckOfCards[26] + "-->");     //Ace of Hearts
        System.out.println(xCard.theCardInDeck[26]);
//        cCard.callCardsFromCards();
//        dDeck.callCardsFromDeck();
//        pPlayer.callCardsFromPlayer();
//        int initialCard = dDeck.dealFirstCard();   //Deck.java   Go get initial card by calling deal first hand which calls Random Number Generator
//        System.out.println(Player.getPlayersName() + " your first card is " + cCard.deckOfCards[initialCard]);
//        System.out.println();


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
