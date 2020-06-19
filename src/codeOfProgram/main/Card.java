package codeOfProgram.main;

public class Card {
    private String value;
    private String suit;
    private String character;

    public String getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }

    public String getCharacter() {
        return character;
    }

    public Card (String value, String suit, String character){
        this.value=value;
        this.suit=suit;
        this.character=character;
    }

    public String printCard(){
        return (character+" "+suit);
    }
}
