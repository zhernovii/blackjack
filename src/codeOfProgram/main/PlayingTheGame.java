package codeOfProgram.main;

import codeOfProgram.actions.AskingForAction;
import codeOfProgram.resources.Configurations;

public class PlayingTheGame {
    private int countOfPoints = 0;
    ResultGame resultGame = new ResultGame();

    public void playingGame() {
        AskingForAction askingForAction = new AskingForAction();
        askingForAction.askingForStartGame();
        String nickname = askingForAction.askingForNickname();
        DeckOfCards deckOfCards = new DeckOfCards();

        while (true) {
            Card card = deckOfCards.takeCard();
            countOfPoints += card.getValue();
            System.out.println(String.format(Configurations.getCounterResultDuringTheGame(), countOfPoints));
            resultGame.countResultDuringTheGame(nickname, countOfPoints);
            boolean takeNewCard = askingForAction.askingForTakingCard();
            if (!takeNewCard) {
                resultGame.countResultAfterUserStop(nickname, countOfPoints);
            }
        }
    }
}
