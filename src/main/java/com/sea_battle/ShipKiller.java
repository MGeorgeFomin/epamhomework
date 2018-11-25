package com.sea_battle;

import java.io.BufferedReader;
import java.io.IOException;


/**
 * @author George Fomin
 * @version 1.0
 */
public class ShipKiller {

    /**
     * method makes a shot asking player and shows the result
     *
     * @param reader gets user input
     * @param killer is a killer class
     * @param victim is an opponent`s class
     * @throws IOException
     */
    void shot(BufferedReader reader, User killer, User victim) throws IOException {

        // keep shooting if shots are successful
        while (checkMyShot(setCellForShooting(reader, killer), killer, victim));
    }

    /**
     * method makes a shot automatically and shows the result
     *
     * @param killer is a killer class
     * @param victim is an opponent`s class
     */
    void shot(User killer, User victim) {

        // keep shooting if shots are successful
        while (checkMyShot(setCellForShooting(killer), killer, victim));
    }

    /**
     * checks if user`s input cell is besides battle field borders or this sell is already shot
     *
     * @param reader gets user`s input
     * @return index of cell for shooting
     * @throws IOException
     */
    private int setCellForShooting(BufferedReader reader, User killer) throws IOException {
        boolean cellIsSet = false;
        int cellForShooting = 0;

        // keep asking player if cell for shooting is not found
        while (cellIsSet == false) {
            System.out.println("Set cell index for shooting");
            cellForShooting = Integer.parseInt(reader.readLine());

            // checks if user`s input cell is besides battle field borders
            if (cellForShooting >= 0 && cellForShooting < killer.shotCells.length) {

                // checking is this sell already shot
                if (killer.shotCells[cellForShooting] == false) {

                    // no, it is not shot yet
                    cellIsSet = true;
                } else {

                    // yes, it is already shot
                    System.out.println("You have already shot this cell!");
                }
            } else {
                System.out.println("There is no such cell!");
            }
        }
        return cellForShooting;
    }

    /**
     * checks if automatically chosen cell is besides battle field borders or this sell is already shot
     *
     * @return index of cell for shooting
     */
    private int setCellForShooting(User killer) {
        boolean cellIsSet = false;
        int cellForShooting = 0;

        // keep choosing cell automatically if cell for shooting is not found
        while (cellIsSet == false) {

            cellForShooting = (int)(Math.random() * killer.shotCells.length);

            // checks if user`s input cell is besides battle field borders
            if (cellForShooting >= 0 && cellForShooting < killer.shotCells.length) {

                // checking is this sell already shot
                if (killer.shotCells[cellForShooting] == false) {

                    // no, it is not shot yet
                    cellIsSet = true;
                }
            }
        }
        return cellForShooting;
    }

    /**
     * marks that shot cell becomes already shot
     * checks if shot is successful
     * if shot is successful method marks shot deck as destroyed
     * if shot destroys the ship method remove this ship from enemy list of ships
     *
     * @param cellForShooting cell which is shooting
     * @param killer is user who is shooting
     * @param victim is user who is shot
     * @return true if shot is successful, false is not
     */
    boolean checkMyShot(int cellForShooting, User killer, User victim) {

        // shows if some enemy deck is successfully shot
        boolean shotIsSuccessful = false;

        // marking the cell as already shot
        killer.shotCells[cellForShooting] = true;

        // trying to find shot deck via enemy ships coordinates
        for (Ship ship : victim.userShips) {

            // checking each deck
            for (int i = 0; i < ship.location.length; i++) {

                // checking if this deck is shot
                if (ship.location[i] == cellForShooting) {

                    // the deck is shot
                    ship.location[i] = -1;
                    shotIsSuccessful = true;

                    // checking if ship is alive
                    if (ship.shipIsAlive()) {

                        // ship is still alive
                        System.out.println("Enemy deck is shot!");
                    } else {

                        // ship is destroyed
                        System.out.println("Enemy ship is killed!");

                        // marking destroyed ship location cells and neighbour cells as already shot
                        for (int k = 0; k < ship.location.length + 2; k++) {
                            try {
                                killer.shotCells[cellForShooting - 1 + k] = true;
                            } catch (IndexOutOfBoundsException e) {
                                continue;
                            }
                        }
                        victim.userShips.remove(ship);
                    }
                    break;
                }
            }

            // checking is there any reason for keep checking enemy ships decks
            if (shotIsSuccessful) {
                break;
            }
        }

        // checking are there any enemy ships on the battle field
        if (victim.userShips.isEmpty()) {
            System.out.println(killer.name + " IS WINNER!!!");
            System.exit(0);
        }

        // if shot is failed it is necessary to show it
        if (!shotIsSuccessful) {
            System.out.println("Shot failed!");
        }
        return shotIsSuccessful;
    }
}