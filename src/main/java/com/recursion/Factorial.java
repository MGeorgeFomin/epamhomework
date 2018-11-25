package com.recursion;

/**
 * @author George Fomin
 * @version 1.0
 */
public class Factorial {
    /**
     * Method which solve task 10.41
     *
     * @param n which is natural
     * @return int which factorial of n
     * @throws NumberFormatException if number < 1
     */
    int getfactorial(int n) {
        int result;

        if (n < 1) {
            throw new NumberFormatException("Number should be >0");
        }
        if (n == 1) {
            return 1;
        }
        result = getfactorial(n - 1) * n;
        return result;
    }
}