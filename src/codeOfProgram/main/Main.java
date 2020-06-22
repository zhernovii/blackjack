package codeOfProgram.main;

import codeOfProgram.actions.AskingForAction;

import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        new Configurations();
        List deckOfCards;

        AskingForAction askingForAction = new AskingForAction();
        deckOfCards = askingForAction.askingForStartGame();
        while (true) {
            deckOfCards = askingForAction.askingForTakingCard(deckOfCards);
        }
    }
}
