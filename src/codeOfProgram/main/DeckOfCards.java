package codeOfProgram.main;

import java.util.ArrayList;
import java.util.List;

public class DeckOfCards {
    public List getDeckOfCards() {
        List<Card> deckOfCards = new ArrayList<>();
        for (EnumCharacters enumCharacters : EnumCharacters.values()) {
            for (EnumSuits enumSuits : EnumSuits.values()) {
                deckOfCards.add(new Card(enumCharacters.value, enumSuits, enumCharacters));
            }
        }
        return deckOfCards;
    }
}

