package com.bank_simulation;

import org.junit.Test;

import java.math.BigDecimal;

public class BankAccountTest {
    BankAccount bankAccount = new BankAccount();

    @Test(expected = NumberFormatException.class)
    public void testWithdrawMoney() {
        bankAccount.withdrawMoney(new BigDecimal(15), 1);
    }
}
