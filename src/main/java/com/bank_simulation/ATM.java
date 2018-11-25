package com.bank_simulation;

import java.math.BigDecimal;

/**
 * @author George Fomin
 * @version 1.0
 */
public class ATM implements Runnable{
    int id;
    BankAccount account;

    ATM(int identificationNumber, BankAccount bankAccount) {
        this.id = identificationNumber;
        this.account = bankAccount;
    }

    /**
     * method simulates random money operations of depositing and withdrawing money with bank account
     */
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++){
                account.depositMoney(new BigDecimal(Math.random() * 1000), id);
                account.withdrawMoney(new BigDecimal(Math.random() * 1000), id);
            }
        } catch (NumberFormatException e) {
            System.err.println(e);
        }
    }
}