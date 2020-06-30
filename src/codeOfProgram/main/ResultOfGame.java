package codeOfProgram.main;

import codeOfProgram.actions.WriteResultToFile;
import codeOfProgram.resources.Configurations;

import java.util.List;

public class ResultOfGame {

    public boolean countResultDuringTheGame(String nickname, int countOfPoints, List<String> result) {
        if (countOfPoints>=21){
//            WriteResultToFile writeResultToFile = new WriteResultToFile();
            if (countOfPoints > 21) {
                System.out.println(String.format(Configurations.getLoseWithBiggerResult(),countOfPoints));
            } else {
                System.out.println(String.format(Configurations.getWinWithExcellentResult(),countOfPoints));
            }
            result.add(nickname+" "+countOfPoints);
//            writeResultToFile.saveResult(nickname, countOfPoints);
            return true;
        }
        return false;
    }

    public boolean countResultAfterUserStop(String nickname, int countOfPoints, List<String> result) {
//        WriteResultToFile writeResultToFile = new WriteResultToFile();

        if (countOfPoints < 18) {
            System.out.println(String.format(Configurations.getLoseWithLessResult(),countOfPoints));
        } else {
            System.out.println(String.format(Configurations.getWinWithLessResult(),countOfPoints));
        }
        result.add(nickname+" "+countOfPoints);
//        writeResultToFile.saveResult(nickname, countOfPoints);
        return true;
    }
}
