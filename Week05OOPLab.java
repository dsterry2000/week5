package CardOOPLab;

import java.util.*;


public class Week05OOPLab {
    // This Lab will give you a basic look at creating an Object-Oriented Card Game.
    //		The idea here is to prepare you for your Week 6 Unit Final Project.
    //		There are many ways to implement this Lab, please use the tools that you know,
    //		and go from there.
    // These exercises are intended to be coded in order 1 through 5.


    public static void main(String[] args) {


        // A standard deck of playing cards has 52 cards as specified below
        //		i. There are 4 suits:  Clubs, Diamonds, Hearts, & Spades
        //
        //	   ii. Each suit has 13 cards:  Two, Three, Four, Five, Six, Seven,
        //									 Eight, Nine, Ten, Jack, Queen, King & Ace
        //
        //	  iii. Comparing Cards:  When comparing two cards, Ace is high and Two is low.
        //							 to make this easy, a Two will have a value of 2, a
        //							 Three will have a value of 3, ... and an Ace will have
        //							 a value of 14.
        //



        System.out.println("\nQuestion 1: Card Class");
        // Add your code here to instantiate a Card
        Card card1 = new Card("5", "Hearts", 5);

        // Call the describe method on the newly instantiated card.
        card1.describe();





        System.out.println("\nQuestion 2: Deck Class");
        // Add your code here to instantiate a Deck
        Deck deck1 = new Deck();
        deck1.describe();
        System.out.println();



         // 3. Deck shuffle() Method:
        //		Add a shuffle method within the Deck Class
        System.out.println("\nQuestion 3: Deck shuffle() method");

        Scanner userInput = new Scanner(System.in);
        System.out.print("How many time do you want to shuffle the deck? ");
        int shuffleNum = userInput.nextInt();
        // Test your method here
        for (int shuffle=0; shuffle<=shuffleNum;shuffle++){
            deck1.shuffleDeck();
            //deck1.describe(); // show deck after each shuffle to prove it shuffled the number of times requested.
            //System.out.println(); print a blank line between each deck display.
        }

        // Call the describe method on the newly shuffled deck.

        deck1.describe();
        System.out.println();


        // 4. Deck draw() Method:
        //		Add a draw method within the Deck Class
        System.out.println("\nQuestion 4: Deck draw() method");
        // Test your method here

        /* This code works, but part of it needs to be implemented in the method for step 5 below.
        System.out.print("How many players? ");
        int players = userIn.nextInt();
        int numCards = 52/players;
        int cardsLeft = 52%players;
        System.out.println("Each player will get " + numCards + " cards.");
        System.out.println("There are " + cardsLeft + " cards left.");
        System.out.println();*/

        //previous attempt to draw cards and place into a hand. Used the subList() method. It works
        //for a single hand since you have to specify a start and stop index. For multiple hands
        //I couldn't get it work. I played around with incrementing the indices, but couldn't get it to work.
        /*for(int p=0;p<=players;p++){
            //int start = 0;
            //int stop = 5;
            for(int index=0;index<=players;index++){
              int start = index;
              int stop = start+index;
              deck1.drawCards(start, stop);
            }*/

        /*This code works. It divides the number of cards by the number of players
         and deals an equal amount of cards to all players, leaving the remainder in the deck.
         This functionality needs to be implemented in step 5 below.
        for(int p=1;p<=players;p++){
            System.out.println("Player " + p);
            for(int c=1;c<=numCards;c++){
                deck1.drawCards();
            }
            System.out.println();
        }*/


        System.out.print("How many cards are in a hand? ");
        int handQuantity = userInput.nextInt();
        System.out.println();
        for(int c=1;c<=handQuantity;c++){
            deck1.drawCards();
        }

            System.out.println();





        // 5. Create Game Board:
        //		Create and test a method that takes an int as a parameter (representing the
        // 			number of players for a game) and returns a Map<String, List<Card>>
        // 			that represents each player (i.e. "Player 1", "Player 2", etc..)
        //			and their cards.
        //
        // 			The method should create a new instance of Deck, shuffle it,
        // 			and deal the cards out to the "players" in the Map.
        System.out.println("\nQuestion 5: Create Game");
        // Call your method here
        System.out.print("Would you like to play a game? (yes/no)");
        String play = userInput.next();
        if(play.equals("yes") || play.equals("y")|| play.equals("Yes") || play.equals("Y")){
            boolean playGame =true;

            if(playGame == true){
                System.out.print("How many players in this game? ");
                int playerNum = userInput.nextInt();
                gameBoard(playerNum);
                System.out.println();
                System.out.println("Cards have been dealt. Let's begin...");
            }
        }else
            System.out.println("You would have lost anyway...");






    }


    // Method 5:
    public static Map<String, List<Card>>gameBoard(int players){
        //ask user for number of cards per hand
        Scanner userInput2 = new Scanner(System.in);
        System.out.print("How many cards per player? ");
        int cardsPerHand = userInput2.nextInt();
        System.out.println();
        //instantiate the new deck
        Deck gameDeck = new Deck();
        //create a map with a key = Player, value = players cards
        Map<String, List<Card>> gamePlay = new HashMap<String, List<Card>>();
        //create ArrayList for cards in a hand
        List<Card> hand = new ArrayList<Card>();
        //shuffle the deck
        gameDeck.shuffleDeck();

        //draw cards for each player, put the player and their cards in the Map
        for(int p=1;p<=players;p++) {
            //draw the number of cards that was indicated by the user
            for (int c = 1; c <= cardsPerHand; c++) {
                gameDeck.drawCards();
            }
            //print a blank line between each player and hand
            System.out.println();
            //add players and their hand to the map
            gamePlay.put("Player"+p, hand);
        }
        return gamePlay;
    }
}
