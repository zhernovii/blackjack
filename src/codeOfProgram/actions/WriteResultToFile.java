package codeOfProgram.actions;

import codeOfProgram.resources.Configurations;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class WriteResultToFile {
    public void saveResult(List<String> result) {
        try (FileWriter fileWriter = new FileWriter(Configurations.getPathToSaveFile(), true)) {
            fileWriter.write(String.valueOf(result));
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern(Configurations.getDateFormat());
            LocalDateTime now = LocalDateTime.now();
            fileWriter.write(dtf.format(now));
            fileWriter.write(Configurations.getSeparationForBetweenResults());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
