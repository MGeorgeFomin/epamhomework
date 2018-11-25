package com.bank_simulation;

/**
 * @author George Fomin
 * @version 1.0
 */
public class BankSimulationMain {
    public static void main(String[] args) {
        BankSimulationMain main = new BankSimulationMain();
        main.go();
    }

    /**
     * Method creates work class objects and starts them
     */
    void go() {
        BankAccount account = new BankAccount();
        Thread atm1 = new Thread(new ATM(1, account));
        Thread atm2 = new Thread(new ATM(2, account));
        Thread atm3 = new Thread(new ATM(3, account));

        atm1.start();
        atm2.start();
        atm3.start();
    }
}