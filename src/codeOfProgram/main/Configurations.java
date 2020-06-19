package codeOfProgram.main;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class Configurations {
    private static final String PATH_TO_CONFIG_FILE = "/Users/vladislavzhernovii/IdeaProjects/21points/src/codeOfProgram/resources/config";

    private static String pathToOpenFile;

    public static String getPathToOpenFile() {
        return pathToOpenFile;
    }

    public Configurations() throws Exception{
        Properties props = new Properties();
        props.load(new InputStreamReader(new FileInputStream(PATH_TO_CONFIG_FILE)));
        pathToOpenFile = props.getProperty("pathToOpenFile");
    }
}
