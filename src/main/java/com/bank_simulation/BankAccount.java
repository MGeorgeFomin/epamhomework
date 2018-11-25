package com.bank_simulation;

import java.math.BigDecimal;

/**
 * @author George Fomin
 * @version 1.0
 */
public class BankAccount {
    private BigDecimal accountMoney = new BigDecimal(10);

    /**
     * Method which withdraw money from bank account if it is possible
     *
     * @param moneyToWithdraw is amount of money you want to withdraw from bank account
     * @param atmId is identification number of ATM which made the operation at the moment
     * @throws NumberFormatException if amount of money to withdraw > accountMoney
     */
    synchronized public void withdrawMoney(BigDecimal moneyToWithdraw, int atmId) {
        if (accountMoney.compareTo(moneyToWithdraw) != -1) {
            accountMoney = accountMoney.subtract(moneyToWithdraw);
            System.out.println("ATM id: " + atmId + " WITHDRAW operation FINISHED");
        } else {
            throw new NumberFormatException("ATM id: " + atmId +" WITHDRAW operation DENIED! There is no so much money!");
        }
    }

    /**
     * Method which withdraw money from bank account if it is possible
     *
     * @param moneyToDeposit is amount of money you want to deposit to bank account
     * @param atmId is identification number of ATM which made the operation at the moment
     */
    synchronized public void depositMoney(BigDecimal moneyToDeposit, int atmId) {
        accountMoney = accountMoney.add(moneyToDeposit);
        System.out.println("ATM id: " + atmId + " DEPOSIT operation FINISHED");
    }
}