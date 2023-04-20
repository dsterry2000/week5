package CardOOPLab;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Deck {
    // 2. Deck Class:
    //		Create a class called Deck.
    //		Fields:  This class should have a list of Card field called cards
    //				 that will hold all the cards in the deck.
    //			List<Card> cards = new ArrayList<Card>();
    //
    //		Constructor: The constructor for the Deck Class should
    // 			instantiate all 52 standard playing cards and add them to the cards list.
    //
    //		Methods:
    //			a.  describe() to describe the deck to the Console --
    //					print out all the cards in the deck.
    //
    //create ArrayLists to hole cards, card names and suit names.

    //List<String> cardName = new ArrayList<String>();

    List<Card> cards = new ArrayList<Card>();
    /*public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }*/





    //don't make Deck void - it won't populate.
    public Deck(){

        List<String> cardSuit = new ArrayList<>();
        //add the suit names to the cardSuit ArrayList
        cardSuit.add("Hearts");
        cardSuit.add("Diamonds");
        cardSuit.add("Spades");
        cardSuit.add("Clubs");


        List<String> numCard = new ArrayList<>();
        //add numCard names to the numCard Arraylist
        numCard.add("2");
        numCard.add("3");
        numCard.add("4");
        numCard.add("5");
        numCard.add("6");
        numCard.add("7");
        numCard.add("8");
        numCard.add("9");
        numCard.add("10");
        numCard.add("Jack");
        numCard.add("Queen");
        numCard.add("King");
        numCard.add("Ace");

        //Card card2 = new Card(numCard.get(0), cardSuit.get(0), 1);
        //cards.add(card2);

        //test adding a single card to the cards ArrayList - describe method returns an address.
        //cards.add(new Card(numCard.get(0), cardSuit.get(0), 1));

        //add hearts suit to the cards ArrayList
        for(int hearts=0;hearts<numCard.size();hearts++) {
            cards.add(new Card(numCard.get(hearts), cardSuit.get(0), hearts+2));
        }
        //add diamonds suit to the cards ArrayList
        for(int diamonds=0;diamonds< numCard.size();diamonds++) {
            cards.add(new Card(numCard.get(diamonds), cardSuit.get(1), diamonds+2));
        }
        //add spades suit to the cards ArrayList
        for(int spades=0;spades< numCard.size();spades++) {
            cards.add(new Card(numCard.get(spades), cardSuit.get(2), spades+2));
        }
        //add clubs suit to the cards ArrayList
        for(int clubs=0;clubs< numCard.size();clubs++) {
            cards.add(new Card(numCard.get(clubs), cardSuit.get(3), clubs+2));
        }

    }

    public void describe(){
        for(Card card : this.cards) {
            card.describe();
        }

    }
    public void shuffleDeck(){
        Collections.shuffle(cards);
    }

    public void drawCards(){ //previous attempt - public void drawCards(int start, int stop)
        List<Card> hand = new ArrayList<Card>();
        //hand = cards.subList(start, stop);
        hand.add(cards.remove(0));

        for(Card h : hand) {
            h.describe();
        }
    }

}
