package codeOfProgram.main;

public enum EnumCharacters {
    SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10),
    JACK(2), QUEEN(3), KING(4), ACE(11);

    int value;


    EnumCharacters(int value){
        this.value = value;
    }

    EnumCharacters() {}
}


