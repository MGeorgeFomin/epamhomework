package com.sea_battle;

import java.io.BufferedReader;
import java.io.IOException;


/**
 * @author George Fomin
 * @version 1.0
 */
public class Ship {

    int[] location;

    /**
     * constructor creates new ship depends on how much decks in this ship we need
     *
     * @param decksNumber is number of decks in ship which is creating
     */
    Ship(int decksNumber) {
        location = new int[decksNumber];

    }

    /**
     * method checks array for free space and sets ship location it is possible
     * marks in array that after setting ship location some cells become close for new ships
     * setting asking player
     *
     * @param reader gets user`s input
     * @param shotCells is array for seeking free space for new ship location
     * @return true if setting location is successful and false if not
     * @throws IOException
     */
    boolean setLocation(BufferedReader reader, boolean[] shotCells) throws IOException {
        System.out.println("Write index for the first deck of your " + location.length + " deck ship");
        int indexOfFirstDeck = Integer.parseInt(reader.readLine());

        // checking player`s input, are these cells free
        if (checkSpaceForTheShip(indexOfFirstDeck, shotCells)) {

            // yes, there is free space
            // setting ship location, marches these cells in shotCells as closed for new ships
            for (int i = 0; i < location.length; i++) {
                location[i] = indexOfFirstDeck + i;
                shotCells[indexOfFirstDeck + i] = false;
            }
            System.out.println("Ship location is set");
            return true;
        } else {

            // there is no free space
            System.out.println("There is no space here!");
            return false;
        }
    }

    /**
     * method checks array for free space and sets ship location it is possible
     * marks in array that after setting ship location some cells become close for new ships
     * setting is automatically
     *
     * @param shotCells is array for seeking free space for new ship location
     * @return true if setting location is successful and false if not
     * @throws IOException
     */
    boolean setLocation(boolean[] shotCells) {
        int indexOfFirstDeck = (int)(Math.random() * shotCells.length);

        if (checkSpaceForTheShip(indexOfFirstDeck, shotCells)) {

            // да, место есть
            // присваиваем location адреса, устанавливаем значения в пполе shotCells как занятые
            for (int i = 0; i < location.length; i++) {
                location[i] = indexOfFirstDeck + i;
                shotCells[indexOfFirstDeck + i] = false;
            }
            System.out.println("Ship location is set");
            return true;
        } else {

            //нет, мест нет
            return false;
        }
    }

    /**
     * checks cells for setting location for new ship
     *
     * @param firstDeckIndex is first index of new ship location
     * @param shotCells array for checking is there any free space on battle field
     * @return true if there is some free space and false if there is not
     */
    boolean checkSpaceForTheShip(int firstDeckIndex, boolean[] shotCells) {
        boolean spaceIsFree = true;

        // смотрим все ячейки палуб корабля и соседние
        for (int i = 0; i < location.length + 2; i++) {

            // не выходят ли палубы за границы поля
            if (firstDeckIndex < 0 || firstDeckIndex + location.length - 1 >= shotCells.length) {
                spaceIsFree = false;
                break;
            }

            // не находится ли одна из границ за пределами поля
            if (firstDeckIndex - 1 + i < 0 || firstDeckIndex - 1 + i == shotCells.length) {
                continue;
            }

            // свободны ли клетки поля для установки корабля
            if(shotCells[firstDeckIndex - 1 + i] == false) {
                spaceIsFree = false;
                break;
            }
        }
        return spaceIsFree;
    }

    /**
     * checks if ship is alive
     *
     * @return true if ship is alive, false if is not alive
     */
    boolean shipIsAlive() {
        boolean shipIsAlive = false;
        for (int i = 0; i < location.length; i++) {
            if (location[i] != -1) {
                shipIsAlive = true;
            }
        }
        return shipIsAlive;
    }

}
