package codeOfProgram.actions;

import codeOfProgram.main.DeckOfCards;

import java.util.List;
import java.util.Scanner;

public class AskingForAction {
    public List askingForStartGame (List deckOfCards){
        System.out.println("Do you wanna play?(1 - yes, 2 - no)");
        Scanner scanner = new Scanner(System.in);
        String tempVarOfStartGame = scanner.next();
        while (true) {
            if (tempVarOfStartGame.equalsIgnoreCase("1")) {
                deckOfCards = new DeckOfCards().getDeckOfCards();
                new CountResultDuringTheGame().playingTheGame(deckOfCards);
                return deckOfCards;
            } else if (tempVarOfStartGame.equals("2")) {
                System.out.println("loser");
                System.exit(0);
            } else {
                System.out.print("You've entered wrong value. Try again");
                tempVarOfStartGame = scanner.next();
            }
            return null;
        }
    }

    public List askingForTakingCard (List deckOfCards){
        System.out.println("Do you wanna take one more card?(1 - yes, 2 - no)");
        Scanner scanner = new Scanner(System.in);
//        CountResultDuringTheGame countResultDuringTheGame = new CountResultDuringTheGame();
        String tempVarOfTakingCard = scanner.next();
        ResultGame resultGame = new ResultGame();
        while (true) {
            if (tempVarOfTakingCard.equalsIgnoreCase("1")) {
                new CountResultDuringTheGame().playingTheGame(deckOfCards);
                return deckOfCards;
            } else if (tempVarOfTakingCard.equals("2")) {
//                resultGame.countResultGame();
                System.exit(0);
            } else {
                System.out.println("You've entered wrong value. Try again");
                tempVarOfTakingCard = scanner.next();
            }
        }
    }
}
