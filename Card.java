package CardOOPLab;




public class Card {
    // 1. Card Class:
    //		Create a class called Card to represent a standard playing card.
    //		Fields:   The Card class should have the following fields:
    // 			a. name field
    //			b. suit field
    //			c. value field for comparing against other cards.
    //
    //		Methods:  This class can have any useful method.
    //			a. describe() to display the card information to the Console.
    //			b. Getters & Setters

    private String name;
    private String suit;
    private int value;

    public Card(String name, String suit, int value) {
        this.name = name;
        this.suit = suit;
        this.value = value;
    }
    public void setName(String name) {

        this.name = name;
    }

    public void setSuit(String suit) {

        this.suit = suit;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {

        return name;
    }

    public String getSuit() {

        return suit;
    }

    public int getValue() {

        return value;
    }

    public void describe(){

        System.out.println("Card: " + this.name + " of "+ this.suit + ", Value: " + this.value);
    }


}
