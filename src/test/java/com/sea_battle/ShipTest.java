package com.sea_battle;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ShipTest {
    Ship ship = new Ship(2);
    boolean[] testArray = new boolean[10];

    @Test
    public void testCheckSpaceForTheShip() {
        Arrays.fill(testArray, true);
        Assert.assertEquals(true, ship.checkSpaceForTheShip(0, testArray));
    }

    @Test
    public void testShipIsAlive() {
        Arrays.fill(testArray, true);
        ship.setLocation(testArray);
        Assert.assertEquals(true, ship.shipIsAlive());
    }
}
