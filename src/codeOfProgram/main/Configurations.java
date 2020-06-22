package codeOfProgram.main;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class Configurations {
    private static final String PATH_TO_CONFIG_FILE = "/Users/vladislavzhernovii/IdeaProjects/21points/src/codeOfProgram/resources/config.ini";

    private static String pathToOpenFile;
    private static String pathToSaveFile;
    private static String dateFormat;
    private static String separationForBetweenResults;

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

    public Configurations() throws Exception{
        Properties props = new Properties();
        props.load(new InputStreamReader(new FileInputStream(PATH_TO_CONFIG_FILE)));
        pathToOpenFile = props.getProperty("pathToOpenFile");
        pathToSaveFile = props.getProperty("pathToSaveFile");
        dateFormat = props.getProperty("dateFormat");
        separationForBetweenResults = props.getProperty("separationForBetweenResults");
    }
}
