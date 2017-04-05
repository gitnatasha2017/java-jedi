package model;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ahmedr3 on 4/5/2017.
 */
public class ShieldTest {

    @Test
    public void testIsDown() {
        Shield shield = new Shield();
        Assert.assertEquals(shield.isDown(), false);
    }

    @Test
    public void testRaiseShield() {
        Shield shield = new Shield();
        shield.raiseShield();
        Assert.assertEquals(shield.isDown(), false);
    }

    @Test
    public void testLowerShield() {
        Shield shield = new Shield();
        shield.lowerShield();
        Assert.assertEquals(shield.isDown(), true);
    }

}


