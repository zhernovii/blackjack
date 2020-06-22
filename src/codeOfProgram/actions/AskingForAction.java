package codeOfProgram.actions;

import codeOfProgram.main.DeckOfCards;
import codeOfProgram.main.WriteResultToFile;

import java.util.List;
import java.util.Scanner;

public class AskingForAction {
    private static String nickName;
    public static String getNickName() {
        return nickName;
    }

    public List askingForStartGame (){
        WriteResultToFile writeResultToFile = new WriteResultToFile();
        System.out.print("Do you wanna play?(1 - yes, 2 - no)");
        Scanner scanner = new Scanner(System.in);
        String tempVarOfStartGame = scanner.next();

        while (true) {
            if (tempVarOfStartGame.equalsIgnoreCase("1")) {
                System.out.print("Enter your nick/name:");
                nickName = scanner.next();
                List deckOfCards = new DeckOfCards().getDeckOfCards();
                new CountResultDuringTheGame().playingTheGame(deckOfCards);
                return deckOfCards;
            } else if (tempVarOfStartGame.equals("2")) {
                String loser = "loser";
                System.out.print(loser);
                writeResultToFile.saveResult("nickName", loser);
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
//        ResultGameContinuing resultGameContinuing = new ResultGameContinuing();
        while (true) {
            if (tempVarOfTakingCard.equalsIgnoreCase("1")) {
                new CountResultDuringTheGame().playingTheGame(deckOfCards);
                new ResultGameContinuing().countResultGame(CountResultDuringTheGame.getCountOfPoints());
                return deckOfCards;
            } else if (tempVarOfTakingCard.equals("2")) {
                new ResultGameFinishing().countResultGame(CountResultDuringTheGame.getCountOfPoints());
            } else {
                System.out.println("You've entered wrong value. Try again");
                tempVarOfTakingCard = scanner.next();
            }
        }
    }
}
