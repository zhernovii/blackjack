package codeOfProgram.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class DeckOfCards {
    private final static String NUMBERS_SPLITTER_IN_STRING = " ";

    public List getDeckOfCards() {
        List<Card> deckOfCards = new ArrayList<>();
        for (EnumCharacters enumCharacters : EnumCharacters.values()) {
            for (EnumSuits enumSuits : EnumSuits.values()) {
                deckOfCards.add(new Card(enumCharacters.value, enumSuits, enumCharacters));
            }
        }
        return deckOfCards;
    }


    
//    @Override
//    public String toString(){   //5, 16
//        String format = "%s %s; %s %s.";
//        List<Card> deckTemp =getDeckOfCards();
//        Card sevenSpades = deckTemp.get(5);
//        String suitSevenSpades = sevenSpades.getSuit();
//        String characterSevenSpades = sevenSpades.getCharacter();
//        Card tenHearts = deckTemp.get(16);
//        String suitTenHearts = tenHearts.getSuit();
//        String characterTenHearts = tenHearts.getCharacter();
//
//        return String.format(format, characterSevenSpades, suitSevenSpades, characterTenHearts,  suitTenHearts);
//    }
}

