package com.sea_battle;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author George Fomin
 * @version 1.0
 */
public class User {
    int userId;
    public String name;
    ArrayList<Ship> userShips = new ArrayList<Ship>();
    User enemy;
    ShipKiller shipKiller;

    /**
     * in array shotCells we mark cells which were shot by the owner of this array(User class in which
     * shotCells is situated)
     * false means that cell is not shot
     * true means that cell is already shot
     */
    boolean[] shotCells = new boolean[10];

    User(int id, ShipKiller enemyShipsKiller) {
        userId = id;
        shipKiller = enemyShipsKiller;
    }

    /**
     * method sets player name asking user
     *
     * @param reader gets user`s input
     * @throws IOException
     */
    void setName(BufferedReader reader) throws IOException {
        System.out.println("Player " + userId + " write your name please");
        name = reader.readLine();
        System.out.println();
    }

    void setEnemy(User enemyUser) {
        enemy = enemyUser;
    }

    /**
     * sets location for player`s ship asking user
     *
     * @param reader gets user`s input
     * @throws IOException
     */
    void setShips(BufferedReader reader) throws IOException {

        /**
         * mark all cells as true for using this array for seeking free space when we will set ships location
         */
        Arrays.fill(shotCells, true);

        // creating ships
        userShips.add(new Ship(1));
        userShips.add(new Ship(2));

        // setting location
        System.out.println(name + " set location for your ships");
        for (Ship ship : userShips) {
            while (ship.setLocation(reader, shotCells) == false);
        }
        System.out.println();

        /**
         * after setting location return all array cells to instant FALSE for using this array
         * as map of shot cells
         */
        Arrays.fill(shotCells, false);
    }

    /**
     * method tells whose turn is now and makes a shot asking turn holder player
     *
     * @param reader gets user`s input
     * @throws IOException
     */
    void myTurn(BufferedReader reader) throws IOException {
        System.out.println("\n" + name + " turn");
        shipKiller.shot(reader, this, enemy);
    }


}