package com.recursion;

import org.junit.Assert;
import org.junit.Test;

public class SummatorTest {
    Summator summator = new Summator();

    @Test
    public void testGetSum() {
        Assert.assertEquals(10, summator.getSum(235));
    }

    @Test(expected = NumberFormatException.class)
    public void testGetSum1() {
        summator.getSum(-1);
    }

    @Test
    public void testGetNumberOfDigits() {
        Assert.assertEquals(6, summator.getNumberOfDigits(123456));
    }

    @Test(expected = NumberFormatException.class)
    public void testGetNumberOfDigits1() {
        summator.getNumberOfDigits(-1);
    }
}
