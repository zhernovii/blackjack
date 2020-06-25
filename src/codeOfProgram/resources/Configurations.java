package codeOfProgram.resources;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class Configurations {
    private static final String PATH_TO_CONFIG_FILE = "/Users/vladislavzhernovii/IdeaProjects/21points/src/codeOfProgram/resources/config.ini";

    private static String pathToOpenFile;
    private static String pathToSaveFile;
    private static String dateFormat;
    private static String separationForBetweenResults;
    private static String finalResult;
    private static String positiveAnswer;
    private static String negativeAnswer;
    private static String askForStartGame;
    private static String askForEnterName;
    private static String loser;
    private static String wrongAnswer;
    private static String askForTakingOneMoreCard;
    private static String counterResultDuringTheGame;
    private static String loseWithBiggerResult;
    private static String loseWithLessResult;
    private static String winWithExcellentResult;
    private static String winWithLessResult;

    public static String getPathToOpenFile() {
        return pathToOpenFile;
    }
    public static String getPathToSaveFile() {
        return pathToSaveFile;
    }
    public static String getDateFormat() {
        return dateFormat;
    }
    public static String getSeparationForBetweenResults() {
        return separationForBetweenResults;
    }
    public static String getFinalResult() {
        return finalResult;
    }
    public static String getPositiveAnswer() {
        return positiveAnswer;
    }
    public static String getNegativeAnswer() {
        return negativeAnswer;
    }
    public static String getAskForStartGame() {
        return askForStartGame;
    }
    public static String getAskForEnterName() {
        return askForEnterName;
    }
    public static String getLoser() {
        return loser;
    }
    public static String getWrongAnswer() {
        return wrongAnswer;
    }
    public static String getAskForTakingOneMoreCard() {
        return askForTakingOneMoreCard;
    }
    public static String getCounterResultDuringTheGame() {
        return counterResultDuringTheGame;
    }
    public static String getLoseWithBiggerResult() {
        return loseWithBiggerResult;
    }
    public static String getLoseWithLessResult() {
        return loseWithLessResult;
    }
    public static String getWinWithExcellentResult() {
        return winWithExcellentResult;
    }
    public static String getWinWithLessResult() {
        return winWithLessResult;
    }

    public Configurations() throws Exception{
        Properties props = new Properties();
        props.load(new InputStreamReader(new FileInputStream(PATH_TO_CONFIG_FILE)));
        pathToOpenFile = props.getProperty("pathToOpenFile");
        pathToSaveFile = props.getProperty("pathToSaveFile");
        dateFormat = props.getProperty("dateFormat");
        separationForBetweenResults = props.getProperty("separationForBetweenResults");
        finalResult = props.getProperty("finalResult");
        positiveAnswer = props.getProperty("positiveAnswer");
        negativeAnswer = props.getProperty("negativeAnswer");
        askForStartGame = props.getProperty("askForStartGame");
        askForEnterName = props.getProperty("askForEnterName");
        loser = props.getProperty("loser");
        wrongAnswer = props.getProperty("wrongAnswer");
        askForTakingOneMoreCard = props.getProperty("askForTakingOneMoreCard");
        counterResultDuringTheGame = props.getProperty("counterResultDuringTheGame");
        loseWithBiggerResult = props.getProperty("loseWithBiggerResult");
        loseWithLessResult = props.getProperty("loseWithLessResult");
        winWithExcellentResult = props.getProperty("winWithExcellentResult");
        winWithLessResult = props.getProperty("winWithLessResult");
    }
}
