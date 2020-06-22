package codeOfProgram.actions;

import codeOfProgram.main.Configurations;
import codeOfProgram.main.WriteResultToFile;

public class ResultGameFinishing implements Result {

    @Override
    public void countResultGame(int countOfPoints) {
        WriteResultToFile writeResultToFile = new WriteResultToFile();
        if (countOfPoints < 18) {
            System.out.println(String.format(Configurations.getLoseWithLessResult(), CountResultDuringTheGame.getCountOfPoints()));
        } else {
            System.out.println(Configurations.getWinWithLessResult());

        }
        writeResultToFile.saveResult(AskingForAction.getNickName(), String.valueOf(CountResultDuringTheGame.getCountOfPoints()));
        System.exit(0);
    }
}
