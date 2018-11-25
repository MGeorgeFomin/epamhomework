package com.sea_battle;

import org.junit.Assert;
import org.junit.Test;

public class ShipKillerTest {

    @Test
    public void testCheckMyShot() {
        ShipKiller shipKiller = new ShipKiller();
        AI aI1 = new AI(1, shipKiller);
        AI aI2 = new AI(2, shipKiller);
        aI1.setEnemy(aI2);
        aI2.setShips();
        aI2.userShips.get(0).location[0] = 0;
        Assert.assertEquals(true, shipKiller.checkMyShot(0, aI1, aI2));
    }
}
