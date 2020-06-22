package codeOfProgram.main;

public enum EnumSuits {
    HEARTS('\u2665'), SPADES('\u2660'), DIAMONDS('\u2666'), CLUBS('\u2663');
    char specSuit;

    EnumSuits(char specSuit){
        this.specSuit=specSuit;
    }
}
