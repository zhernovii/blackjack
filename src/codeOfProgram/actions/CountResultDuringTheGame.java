package codeOfProgram.actions;

import codeOfProgram.main.Card;

import java.util.List;

public class CountResultDuringTheGame {
    private int countOfTakenCards = 0;
    private static int countOfPoints = 0;
    ActionWithDeck actionWithDeck = new ActionWithDeck();
    int idTakenCard;
    Card tempTakenCard;

    public List playingTheGame(List deckOfCards) {
        idTakenCard = actionWithDeck.takeCard(deckOfCards);
        tempTakenCard = (Card) deckOfCards.get(idTakenCard);
        System.out.println(tempTakenCard.printCard());
        countOfPoints += Integer.parseInt(tempTakenCard.getValue());
        actionWithDeck.deleteTakenCardFromDeck(deckOfCards, idTakenCard);
        countOfTakenCards++;


        return deckOfCards;
    }
}
