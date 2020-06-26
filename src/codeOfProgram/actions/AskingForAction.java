package codeOfProgram.actions;

import codeOfProgram.main.PlayingTheGame;
import codeOfProgram.resources.Configurations;

import java.util.Scanner;

public class AskingForAction {
    Scanner scanner = new Scanner(System.in);
    public void askingForStartGame (){
        WriteResultToFile writeResultToFile = new WriteResultToFile();
        System.out.print(Configurations.getAskForStartGame());
        String tempVarOfStartGame = scanner.next();
        while (true) {
            if (tempVarOfStartGame.equals(Configurations.getPositiveAnswer())) {
                break;
            } else if (tempVarOfStartGame.equals(Configurations.getNegativeAnswer())) {
                System.out.print(Configurations.getLoser());
                writeResultToFile.saveResult(Configurations.getLoser(),0);
                System.exit(0);
            } else {
                System.out.print(Configurations.getWrongAnswer());
                tempVarOfStartGame = scanner.next();
            }
        }
    }

    public boolean askingForTakingCard (){
        System.out.println(Configurations.getAskForTakingOneMoreCard());
        String tempVarOfTakingCard = scanner.next();
        while (true) {
            if (tempVarOfTakingCard.equals(Configurations.getPositiveAnswer())) {
                return true;
            } else if (tempVarOfTakingCard.equals(Configurations.getNegativeAnswer())) {
                return false;
            } else {
                System.out.println(Configurations.getWrongAnswer());
                tempVarOfTakingCard = scanner.next();
            }
        }
    }
    public String askingForNickname (){
        System.out.print(Configurations.getAskForEnterName());
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public void askingForNewGame (String nickname) {
        System.out.println(Configurations.getAskForStartNewGame());
        String tempVarOfStartingNewGame = scanner.next();
        if (tempVarOfStartingNewGame.equals(Configurations.getPositiveAnswer())) {
            new PlayingTheGame().playingGame(nickname);
        } else if (tempVarOfStartingNewGame.equals(Configurations.getNegativeAnswer())) {
            System.exit(0);
        } else {
            System.out.println(Configurations.getWrongAnswer());
            tempVarOfStartingNewGame = scanner.next();
        }
    }
}
