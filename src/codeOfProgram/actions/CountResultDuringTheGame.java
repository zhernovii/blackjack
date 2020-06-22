package codeOfProgram.actions;

import codeOfProgram.main.Card;
import codeOfProgram.main.Configurations;

import java.util.List;

public class CountResultDuringTheGame {
    private static int countOfTakenCards = 0;
    private static int countOfPoints = 0;
    ActionWithDeck actionWithDeck = new ActionWithDeck();
    int idTakenCard;
    Card tempTakenCard;

    public static int getCountOfPoints() {
        return countOfPoints;
    } //should be static

    public List playingTheGame(List deckOfCards) {
        idTakenCard = actionWithDeck.takeCard(deckOfCards);
        tempTakenCard = (Card) deckOfCards.get(idTakenCard);
        System.out.println(tempTakenCard.printCard());
        countOfPoints += tempTakenCard.getValue();
        actionWithDeck.deleteTakenCardFromDeck(deckOfCards, idTakenCard);
        countOfTakenCards++;
        System.out.println(String.format(Configurations.getCounterResultDuringTheGame(), countOfPoints, countOfTakenCards));

        return deckOfCards;
    }
}
