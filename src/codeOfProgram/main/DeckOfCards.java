package codeOfProgram.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class DeckOfCards {
    private final static String NUMBERS_SPLITTER_IN_STRING = " ";

    public List getDeckOfCards() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(Configurations.getPathToOpenFile()));
            String line = reader.readLine();
            List<Card> deckOfCardsList = new ArrayList<>();
            while (line != null) {
                String[] tempArrayString = line.split(NUMBERS_SPLITTER_IN_STRING);
                Card card = new Card(tempArrayString[0], tempArrayString[1], tempArrayString[2]);
                deckOfCardsList.add(card);
                line = reader.readLine();
            }
            return deckOfCardsList;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    @Override
    public String toString(){   //5, 16
        String format = "%s %s; %s %s.";
        List<Card> deckTemp =getDeckOfCards();
        Card sevenSpades = deckTemp.get(5);
        String suitSevenSpades = sevenSpades.getSuit();
        String characterSevenSpades = sevenSpades.getCharacter();
        Card tenHearts = deckTemp.get(16);
        String suitTenHearts = tenHearts.getSuit();
        String characterTenHearts = tenHearts.getCharacter();

        return String.format(format, characterSevenSpades, suitSevenSpades, characterTenHearts,  suitTenHearts);
    }
}

