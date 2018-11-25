package com.recursion;

/**
 * @author George Fomin
 * @version 1.0
 */
public class Summator {
    /**
     * Method which solve task 10.43 a)
     *
     * @param number which is natural
     * @return int which is a sum of number digits
     * @throws NumberFormatException if number <0
     */
    public int getSum(int number) {
        if (number < 0) {
            throw new NumberFormatException("Number should be >=0");
        }
        if (number < 10) {
            return number;
        }
        String numberByString = Integer.toString(number);
        return Integer.parseInt(numberByString.substring(0, 1)) + getSum(Integer.parseInt(numberByString.substring(1)));
    }

    /**
     * Method which solve task 10.43 b)
     *
     * @param number which is natural
     * @return int which is a number digits of your param
     * @throws NumberFormatException if number <0
     */
    public int getNumberOfDigits(int number) {
        if (number < 0) {
            throw new NumberFormatException("Number should be >=0");
        }
        if (number < 10) {
            return 1;
        }
        String numberByString = Integer.toString(number).substring(1);
        return 1 + getNumberOfDigits(Integer.parseInt(numberByString));
    }
}