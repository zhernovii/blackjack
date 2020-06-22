package codeOfProgram.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Card {
    private int value;
    private EnumSuits suit;
    private EnumCharacters character;

    public int getValue() {
        return value;
    }
    public EnumSuits getSuit() {
        return suit;
    }
    public EnumCharacters getCharacter() {
        return character;
    }

    public Card(int value, EnumSuits suit, EnumCharacters character) {
        this.value = value;
        this.suit = suit;
        this.character = character;
    }
//    public Card(){}

    public String printCard() {
        return (character.toString() + " " + suit);
    }
}

class GetCard {
    public static void main(String[] args) {
        List<Card> cardFromDeck = new ArrayList<>();
        for (EnumCharacters enumCharacters : EnumCharacters.values()) {
            for (EnumSuits enumSuits : EnumSuits.values()) {
                cardFromDeck.add(new Card(enumCharacters.value, enumSuits, enumCharacters));
            }
        }

        for (Card decksCards: cardFromDeck){
            System.out.println(decksCards.printCard());
        }

        System.out.println(new Card(EnumCharacters.ACE.value , EnumSuits.CLUBS, EnumCharacters.ACE).printCard());
    }
}
