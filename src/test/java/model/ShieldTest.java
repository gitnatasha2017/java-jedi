package model;

import Utils.EnergyUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ahmedr3 on 4/5/2017.
 */
public class ShieldTest {

    @Test
    public void testIsDown() {
        Shield shield = new Shield();
        Assert.assertEquals(shield.isDown(), true);
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

    @Test
    public void testRaiseOnDamagedShield() {

        Shield shield = new Shield();
        shield.setDamaged();
        shield.raiseShield();

        Assert.assertEquals(shield.isDown(), true);
    }

    @Test
    public void testSetShieldEnergy() {

        Shield shield = new Shield();
        int energyUnits =  EnergyUtils.MIN_ENERGY_UNITS +
                (int)(Math.random() * (( EnergyUtils.MAX_ENERGY_UNITS - EnergyUtils.MIN_ENERGY_UNITS) + 1));

        shield.setEnergyPoints(energyUnits);

        Assert.assertEquals(shield.getEnergyPoints(), energyUnits);
    }


    @Test
    public void testSetEnergyPointsOnDamagedShield() {


        int initialEnergyUnits =  EnergyUtils.MIN_ENERGY_UNITS +
                (int)(Math.random() * (( EnergyUtils.MAX_ENERGY_UNITS - EnergyUtils.MIN_ENERGY_UNITS) + 1));

        Shield shield = new Shield(initialEnergyUnits);

        Assert.assertEquals(shield.getEnergyPoints(), initialEnergyUnits);

        shield.setDamaged();

        int energyUnits =  EnergyUtils.MIN_ENERGY_UNITS +
                (int)(Math.random() * (( EnergyUtils.MAX_ENERGY_UNITS - EnergyUtils.MIN_ENERGY_UNITS) + 1));

        shield.setEnergyPoints(energyUnits);

        // Should not have changed
        Assert.assertEquals(shield.getEnergyPoints(), initialEnergyUnits);
    }

}


