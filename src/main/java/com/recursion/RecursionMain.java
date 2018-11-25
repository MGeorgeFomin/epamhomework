package com.recursion;

/**
 * @author George Fomin
 * @version 1.0
 */
public class RecursionMain {
    public static void main(String[] args) {
        RecursionMain main = new RecursionMain();
        main.go();
    }

    /**
     * Method creates work class objects and shows the result of work
     */
    public void go() {
        Factorial factorial = new Factorial();
        Power power = new Power();
        Summator summator = new Summator();
        System.out.println(factorial.getfactorial(5));
        System.out.println(power.getPower(2.5, 3));
        System.out.println(summator.getSum(235));
        System.out.println(summator.getNumberOfDigits(123456));
    }
}