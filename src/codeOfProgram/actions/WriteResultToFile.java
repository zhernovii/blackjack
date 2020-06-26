package codeOfProgram.actions;

import codeOfProgram.resources.Configurations;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WriteResultToFile {
    public void saveResult(String name, int result) {
        try (FileWriter fileWriter = new FileWriter(Configurations.getPathToSaveFile(), true)) {
            fileWriter.write(String.format(Configurations.getFinalResult(),name, result));
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern(Configurations.getDateFormat());
            LocalDateTime now = LocalDateTime.now();
            fileWriter.write(dtf.format(now));
            fileWriter.write(Configurations.getSeparationForBetweenResults());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
