package codeOfProgram.main;

import codeOfProgram.actions.WriteResultToFile;
import codeOfProgram.resources.Configurations;

public class ResultGame {

    public void countResultDuringTheGame(String nickname, int countOfPoints) {
        WriteResultToFile writeResultToFile = new WriteResultToFile();
        if (countOfPoints>=21){
            if (countOfPoints > 21) {
                System.out.println(String.format(Configurations.getLoseWithBiggerResult(),countOfPoints));
            } else {
                System.out.println(String.format(Configurations.getWinWithExcellentResult(),countOfPoints));
            }
            writeResultToFile.saveResult(nickname, countOfPoints);
            System.exit(0);
        }
    }

    public void countResultAfterUserStop(String nickname, int countOfPoints) {
        WriteResultToFile writeResultToFile = new WriteResultToFile();
        if (countOfPoints < 18) {
            System.out.println(String.format(Configurations.getLoseWithLessResult(),countOfPoints));
        } else {
            System.out.println(String.format(Configurations.getWinWithLessResult(),countOfPoints));
        }
        writeResultToFile.saveResult(nickname, countOfPoints);
        System.exit(0);
    }
}
