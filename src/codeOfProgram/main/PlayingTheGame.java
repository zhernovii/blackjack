package codeOfProgram.main;

import codeOfProgram.actions.AskingForAction;
import codeOfProgram.resources.Configurations;

public class PlayingTheGame {
    public void playingGame(String nickname) {
        int countOfPoints = 0;
        boolean endOfGame;
        boolean takeNewCard=false;

        AskingForAction askingForAction = new AskingForAction();
        askingForAction.askingForStartGame();
        if(nickname==null){
            nickname = askingForAction.askingForNickname();
        }
        DeckOfCards deckOfCards = new DeckOfCards();
        ResultGame resultGame = new ResultGame();

        while (true) {
            Card card = deckOfCards.takeCard();
            countOfPoints += card.getValue();
            System.out.println(String.format(Configurations.getCounterResultDuringTheGame(), countOfPoints));
            endOfGame = resultGame.countResultDuringTheGame(nickname, countOfPoints);
            if (!endOfGame) {
                takeNewCard = askingForAction.askingForTakingCard();
            }
            if (!takeNewCard) {
                endOfGame = resultGame.countResultAfterUserStop(nickname, countOfPoints);
            }
            if (endOfGame){
                askingForAction.askingForNewGame(nickname);
            }
        }
    }
}
