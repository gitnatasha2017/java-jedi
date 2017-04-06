package model;

import Utils.SubsystemClient;
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
        int energyUnits =  SubsystemClient.MIN_ENERGY_UNITS +
                (int)(Math.random() * (( SubsystemClient.MAX_ENERGY_UNITS - SubsystemClient.MIN_ENERGY_UNITS) + 1));

        shield.setEnergyPoints(energyUnits);

        Assert.assertEquals(shield.getEnergyPoints(), energyUnits);
    }


    @Test
    public void testSetEnergyPointsOnDamagedShield() {


        int initialEnergyUnits =  SubsystemClient.MIN_ENERGY_UNITS +
                (int)(Math.random() * (( SubsystemClient.MAX_ENERGY_UNITS - SubsystemClient.MIN_ENERGY_UNITS) + 1));

        Shield shield = new Shield(initialEnergyUnits);

        Assert.assertEquals(shield.getEnergyPoints(), initialEnergyUnits);

        shield.setDamaged();

        int energyUnits =  SubsystemClient.MIN_ENERGY_UNITS +
                (int)(Math.random() * (( SubsystemClient.MAX_ENERGY_UNITS - SubsystemClient.MIN_ENERGY_UNITS) + 1));

        shield.setEnergyPoints(energyUnits);

        // Should not have changed
        Assert.assertEquals(shield.getEnergyPoints(), initialEnergyUnits);
    }

}


