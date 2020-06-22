package codeOfProgram.main;

public class Card {
    private int value;
    private EnumSuits suit;
    private EnumCharacters character;
    private static final String PRINT_CARD_TEXT = "%s %s";

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
        return (String.format(PRINT_CARD_TEXT, character.toString(), suit.specSuit));
    }
}

