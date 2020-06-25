package codeOfProgram.actions;

import codeOfProgram.resources.Configurations;

import java.util.Scanner;

public class AskingForAction {

    public void askingForStartGame (){
        WriteResultToFile writeResultToFile = new WriteResultToFile();
        System.out.print(Configurations.getAskForStartGame());
        Scanner scanner = new Scanner(System.in);
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
        Scanner scanner = new Scanner(System.in);
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
}
