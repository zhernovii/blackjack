package codeOfProgram.main;

import codeOfProgram.actions.AskingForAction;
import codeOfProgram.resources.Configurations;

import java.util.ArrayList;
import java.util.List;

public class PlayingTheGame {
    private DeckOfCards deckOfCards;
    private int countOfPoints;
    private boolean newGame;

    public void playingGame() {
        countOfPoints = 0;
        boolean endOfGame;
        boolean takeNewCard;
        String nickname;
        List<String> resultFromAllGames = new ArrayList<>();
        AskingForAction askingForAction = new AskingForAction();
        askingForAction.startNewGame();
        nickname = askingForAction.askingForNickname();
        deckOfCards = new DeckOfCards();
        ResultOfGame resultOfGame = new ResultOfGame();

        while (true) {
            Card card = deckOfCards.takeCard();
            countOfPoints += card.getValue();
            System.out.println(String.format(Configurations.getCounterResultDuringTheGame(), countOfPoints));
            endOfGame = resultOfGame.countResultDuringTheGame(nickname, countOfPoints, resultFromAllGames);
            takeNewCard = askingForAction.takingNewCard(endOfGame);
            endOfGame = resultOfGame.countResultAfterUserStop(nickname, countOfPoints, resultFromAllGames, takeNewCard, endOfGame);
            newGame = askingForAction.askingForNewGame(resultFromAllGames, endOfGame);
            startNewGame(newGame);
        }
    }

    private void startNewGame(boolean newGame) {
        if (newGame) {
            this.deckOfCards = new DeckOfCards();
            this.countOfPoints = 0;
            this.newGame = false;
        }
    }
}
