package com.recursion;

import org.junit.Assert;
import org.junit.Test;

public class PowerTest {
    Power power = new Power();

    @Test
    public void testGetPower() {
        Assert.assertEquals(8.0, power.getPower(2.0, 3), 0.5);
        Assert.assertEquals(15.625, power.getPower(2.5, 3), 0.5);
    }

    @Test(expected = NumberFormatException.class)
    public void testGetPower1() {
        power.getPower(2, -1);
    }
}
