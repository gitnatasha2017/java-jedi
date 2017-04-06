package model;

import Utils.EnergyUtils;
import org.junit.Assert;
import org.junit.Test;

public class ShipReserveTest {

    @Test
    public void testShipReserveCreated() {
        ShipReserve shipReserve = new ShipReserve();
        Assert.assertEquals(shipReserve.getEnergyPoints(), EnergyUtils.MAX_ENERGY_UNITS);
    }

    @Test
    public void testSetEnergyPointsOnDamagedShield() {


        int initialEnergyUnits =  EnergyUtils.MIN_ENERGY_UNITS +
                (int)(Math.random() * (( EnergyUtils.MAX_ENERGY_UNITS - EnergyUtils.MIN_ENERGY_UNITS) + 1));

        ShipReserve shipReserve = new ShipReserve(initialEnergyUnits);

        Assert.assertEquals(shipReserve.getEnergyPoints(), initialEnergyUnits);

        shipReserve.setDamaged();

        int energyUnits =  EnergyUtils.MIN_ENERGY_UNITS +
                (int)(Math.random() * (( EnergyUtils.MAX_ENERGY_UNITS - EnergyUtils.MIN_ENERGY_UNITS) + 1));

        shipReserve.setEnergyPoints(energyUnits);

        // Should not have changed
        Assert.assertEquals(shipReserve.getEnergyPoints(), initialEnergyUnits);
    }

    @Test
    public void testSetShipReserveEnergy() {

        ShipReserve shipReserve = new ShipReserve();
        int energyUnits =  EnergyUtils.MIN_ENERGY_UNITS +
                (int)(Math.random() * (( EnergyUtils.MAX_ENERGY_UNITS - EnergyUtils.MIN_ENERGY_UNITS) + 1));

        shipReserve.setEnergyPoints(energyUnits);

        Assert.assertEquals(shipReserve.getEnergyPoints(), energyUnits);
    }


}



