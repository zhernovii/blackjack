package codeOfProgram.actions;

import codeOfProgram.main.Configurations;
import codeOfProgram.main.DeckOfCards;
import codeOfProgram.main.WriteResultToFile;

import java.util.List;
import java.util.Scanner;

public class AskingForAction {
    private static String nickName;
    public static String getNickName() {
        return nickName;
    }  //should be static

    public List askingForStartGame (){
        WriteResultToFile writeResultToFile = new WriteResultToFile();
        System.out.print(Configurations.getAskForStartGame());
        Scanner scanner = new Scanner(System.in);
        String tempVarOfStartGame = scanner.next();

        while (true) {
            if (tempVarOfStartGame.equals(Configurations.getPositiveAnswer())) {
                System.out.print(Configurations.getAskForEnterName());
                nickName = scanner.next();
                List deckOfCards = new DeckOfCards().getDeckOfCards();
                new CountResultDuringTheGame().playingTheGame(deckOfCards);
                return deckOfCards;
            } else if (tempVarOfStartGame.equals(Configurations.getNegativeAnswer())) {
                System.out.print(Configurations.getLoser());
                writeResultToFile.saveResult(Configurations.getLoser(),Configurations.getLoser());
                System.exit(0);
            } else {
                System.out.print(Configurations.getWrongAnswer());
                tempVarOfStartGame = scanner.next();
            }
            return null;
        }
    }

    public List askingForTakingCard (List deckOfCards){
        System.out.println(Configurations.getAskForTakingOneMoreCard());
        Scanner scanner = new Scanner(System.in);
        String tempVarOfTakingCard = scanner.next();
        while (true) {
            if (tempVarOfTakingCard.equals(Configurations.getPositiveAnswer())) {
                new CountResultDuringTheGame().playingTheGame(deckOfCards);
                new ResultGameContinuing().countResultGame(CountResultDuringTheGame.getCountOfPoints());
                return deckOfCards;
            } else if (tempVarOfTakingCard.equals(Configurations.getNegativeAnswer())) {
                new ResultGameFinishing().countResultGame(CountResultDuringTheGame.getCountOfPoints());
            } else {
                System.out.println(Configurations.getWrongAnswer());
                tempVarOfTakingCard = scanner.next();
            }
        }
    }
}
