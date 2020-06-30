package codeOfProgram.main;

import codeOfProgram.main.PlayingTheGame;
import codeOfProgram.resources.Configurations;

public class Main {

    public static void main(String[] args) throws Exception {

        new Configurations();

        new PlayingTheGame().playingGame();
    }
}
