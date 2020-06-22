package codeOfProgram.actions;

import codeOfProgram.main.Card;

import java.util.List;

public class ActionWithDeck {
    public int takeCard(List<Card> deck) {
        int getRandomCardId = (int) (Math.random() * deck.size());
        return getRandomCardId;
    }

    public List deleteTakenCardFromDeck(List deckOfCards, int cardId) {
        deckOfCards.remove(cardId);
        return deckOfCards;
    }

    public void printDeck(List<Card> deck) {
        for (Card temp : deck) {
            System.out.println(temp.printCard());
        }
    }
//    public List takeCard(List<Card> deck){
//        int getRandomCardId = (int) (Math.random()*36);
//        Card card = deck.get(getRandomCardId);
//        System.out.println(card.getCharacter()+" "+card.getSuit());
//        deck.remove(getRandomCardId);
//        return deck;
//    }
}
