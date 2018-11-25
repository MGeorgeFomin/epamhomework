package com.sea_battle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Class which creates object of Runner and run the game via Runner`s methods
 *
 * @author George Fomin
 * @version 1.0
 */
public class SeaBattleApp {
    public static void main(String[] args) {
        Runner runner = new Runner();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            runner.chooseMode(reader);
            runner.startTheGame(reader);
            runner.playTheGame(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
