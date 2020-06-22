package codeOfProgram.actions;

import codeOfProgram.main.Configurations;
import codeOfProgram.main.WriteResultToFile;

public class ResultGameContinuing implements Result {

    @Override
    public void countResultGame(int countOfPoints) {
        WriteResultToFile writeResultToFile = new WriteResultToFile();

        if (countOfPoints > 21) {
            System.out.println(String.format(Configurations.getLoseWithBiggerResult(), CountResultDuringTheGame.getCountOfPoints()));
            writeResultToFile.saveResult(AskingForAction.getNickName(), String.valueOf(CountResultDuringTheGame.getCountOfPoints()));

            System.exit(0);

        } else {
            if (countOfPoints == 21) {
                System.out.println(Configurations.getWinWithExcellentResult());
                writeResultToFile.saveResult(AskingForAction.getNickName(), String.valueOf(CountResultDuringTheGame.getCountOfPoints()));
                System.exit(0);
            }
        }
    }
}
