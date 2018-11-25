package com.recursion;

/**
 * @author George Fomin
 * @version 1.0
 */
public class Power {
    /**
     * Method which solve task 10.42
     *
     * @param number which is double
     * @param power wich is natural
     * @return double which is a power of number
     * @throws NumberFormatException if power is <0
     */
    double getPower(double number, int power) {
        if (power < 0) {
            throw new NumberFormatException("Power should be >0");
        }
        if (power == 0) {
            return 1;
        }
        return number * getPower(number, power - 1);
    }
}