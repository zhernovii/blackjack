package codeOfProgram.main;

import codeOfProgram.actions.AskingForAction;
import codeOfProgram.resources.Configurations;

import java.util.ArrayList;
import java.util.List;

public class PlayingTheGame {
    public void playingGame() {
        int countOfPoints = 0;
        boolean endOfGame;
        boolean takeNewCard=false;
        boolean newGame=false;
        String nickname = null;
        List <String> resultFromAllGames = new ArrayList<>();

        AskingForAction askingForAction = new AskingForAction();
        askingForAction.startNewGame();
        if(nickname==null){
            nickname = askingForAction.askingForNickname();
        }
        DeckOfCards deckOfCards = new DeckOfCards();
        ResultOfGame resultOfGame = new ResultOfGame();

        while (true) {
            Card card = deckOfCards.takeCard();
            countOfPoints += card.getValue();
            System.out.println(String.format(Configurations.getCounterResultDuringTheGame(), countOfPoints));
            endOfGame = resultOfGame.countResultDuringTheGame(nickname, countOfPoints, resultFromAllGames);
            if (!endOfGame) {
                takeNewCard = askingForAction.takingNewCard();
            }
            if (!takeNewCard) {
                endOfGame = resultOfGame.countResultAfterUserStop(nickname, countOfPoints, resultFromAllGames);
            }
            if (endOfGame){
                newGame = askingForAction.askingForNewGame(resultFromAllGames);
            }
            if (newGame){
                deckOfCards = new DeckOfCards();
                countOfPoints = 0;
                newGame=false;
            }
        }
    }
}
