package codeOfProgram.main;

import codeOfProgram.main.Card;

import java.util.ArrayList;
import java.util.List;

public class DeckOfCards {
    private List<Card> deckOfCards;

    public DeckOfCards(){
        this.deckOfCards=getDeckOfCards();
    }

    public Card takeCard(){
        Card card = deckOfCards.get((int) (Math.random()*deckOfCards.size()));
        System.out.println(card.printCard());
        deckOfCards.remove(card);
        return card;
    }

    private List<Card> getDeckOfCards() {
        List<Card> deckOfCards = new ArrayList<>();
        for (Card.EnumCharacters enumCharacters : Card.EnumCharacters.values()) {
            for (Card.EnumSuits enumSuits : Card.EnumSuits.values()) {
                deckOfCards.add(new Card(enumCharacters.value, enumSuits, enumCharacters));
            }
        }
        return deckOfCards;
    }

    public void printDeck(List<Card> deck) {
        for (Card temp : deck) {
            temp.printCard();
        }
    }

}

