package com.sea_battle;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author George Fomin
 * @version 1.0
 *
 */
public class Runner {
    int numberOfPlayers = 0;
    ShipKiller shipKiller = new ShipKiller();
    User user1 = new User(1, shipKiller);
    User user2;
    AI aI;

    /**
     * method asks user how much users will play the game
     * if user wrote wrong mode number, method asks user again
     * if user wrote anything else then a number? method throws an exception
     *
     * @param reader gets user`s input
     * @throws IOException
     */
    void chooseMode(BufferedReader reader) throws IOException {
        while (numberOfPlayers != 1 && numberOfPlayers != 2) {
            System.out.println("Choose game mode");
            System.out.println("1. Single player");
            System.out.println("2. Two players");
            numberOfPlayers = Integer.parseInt(reader.readLine());
        }
        System.out.println("Mode is chosen\n");
    }

    /**
     * method creates second player class depends on chosen mode: 2(second user) or 1(fight against AI) players,
     * sets names asking users, sets enemies for player`s classes
     *
     * @param reader gets user`s input
     * @throws IOException
     */
    void startTheGame(BufferedReader reader) throws IOException {
        if (numberOfPlayers == 2) {

            user2 = new User(2, shipKiller);

            user1.setName(reader);
            user1.setEnemy(user2);
            user1.setShips(reader);

            user2.setName(reader);
            user2.setEnemy(user1);
            user2.setShips(reader);
        } else {
            aI = new AI(2, shipKiller);

            user1.setName(reader);
            user1.setEnemy(aI);
            user1.setShips(reader);

            aI.setName();
            aI.setEnemy(user1);
            aI.setShips();
        }
    }

    /**
     * depends on the game`s mode method starts players` classes work until one of the players will win
     *
     * @param reader gets user`s input
     * @throws IOException
     */
    void playTheGame(BufferedReader reader) throws IOException {

        if (numberOfPlayers == 2) {
            System.out.println(user1.name + " vs " + user2.name);
            while (true) {
                user1.myTurn(reader);
                user2.myTurn(reader);
            }
        } else {
            System.out.println(user1.name + " vs " + aI.name);
            while (true) {
                user1.myTurn(reader);
                aI.myTurn();
            }
        }
    }
}
