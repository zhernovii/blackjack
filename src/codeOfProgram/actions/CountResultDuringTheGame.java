package codeOfProgram.actions;

import codeOfProgram.main.Card;

import java.util.List;

public class CountResultDuringTheGame {
    private static int countOfTakenCards = 0;
    private static int countOfPoints = 0;
    ActionWithDeck actionWithDeck = new ActionWithDeck();
    int idTakenCard;
    Card tempTakenCard;

    public static int getCountOfTakenCards() {
        return countOfTakenCards;
    }
    public static int getCountOfPoints() {
        return countOfPoints;
    }

    public List playingTheGame(List deckOfCards) {
        idTakenCard = actionWithDeck.takeCard(deckOfCards);
        tempTakenCard = (Card) deckOfCards.get(idTakenCard);
        System.out.println(tempTakenCard.printCard());
        countOfPoints += tempTakenCard.getValue();
        actionWithDeck.deleteTakenCardFromDeck(deckOfCards, idTakenCard);
        countOfTakenCards++;
        System.out.println(countOfPoints+" points/"+countOfTakenCards+" card(-s) were taken");

        return deckOfCards;
    }
}
