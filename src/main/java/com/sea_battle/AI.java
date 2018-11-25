package com.sea_battle;


import java.util.Arrays;

/**
 * @author George Fomin
 * @version 1.0
 */
public class AI extends User {
    AI(int id, ShipKiller enemyShipsKiller) {
        super(id, enemyShipsKiller);
    }

    /**
     * sets player`s name automatically
     */
    void setName() {
        name = "AI";
    }

    /**
     * sets location for player`s ship automatically
     */
    void setShips() {

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
            while (ship.setLocation(shotCells) == false);
        }
        System.out.println();

        /**
         * after setting location return all array cells to instant FALSE for using this array
         * as map of shot cells
         */
        Arrays.fill(shotCells, false);
    }

    /**
     * method tells whose turn is now and makes a shot automatically
     */
    void myTurn() {
        System.out.println("\n" + name + " turn");
        shipKiller.shot(this, enemy);
    }
}
