package codeOfProgram.main;

public class Card {
    private int value;
    private EnumSuits suit;
    private EnumCharacters character;
    private static final String PRINT_CARD_TEXT = "%s %s";

    public int getValue() {
        return value;
    }

//    public EnumSuits getSuit() {
//        return suit;
//    }

//    public EnumCharacters getCharacter() {
//        return character;
//    }

    public Card(int value, EnumSuits suit, EnumCharacters character) {
        this.value = value;
        this.suit = suit;
        this.character = character;
    }
//    public Card(){}

    public String printCard() {
        return (String.format(PRINT_CARD_TEXT, character.toString(), suit.specSuit));
    }

    public enum EnumCharacters {
        SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10),
        JACK(2), QUEEN(3), KING(4), ACE(11);

        public int value;

        EnumCharacters(int value){
            this.value = value;
        }

        EnumCharacters() {}
    }

    public enum EnumSuits {
        HEARTS('\u2665'), SPADES('\u2660'), DIAMONDS('\u2666'), CLUBS('\u2663');
        char specSuit;

        EnumSuits(char specSuit){
            this.specSuit=specSuit;
        }
    }
}

