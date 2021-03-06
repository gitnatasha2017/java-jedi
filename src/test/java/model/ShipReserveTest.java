package model;

import client.SubsystemClient;
import org.junit.Assert;
import org.junit.Test;

public class ShipReserveTest {

    @Test
    public void testShipReserveCreated() {
        ShipReserve shipReserve = new ShipReserve();
        Assert.assertEquals(shipReserve.getEnergyPoints(), SubsystemClient.MAX_ENERGY_UNITS);
    }

    @Test
    public void testSetEnergyPointsOnDamagedShipReserve() {

        int initialEnergyUnits = TestUtilities.getAnyIntInRange(SubsystemClient.MIN_ENERGY_UNITS,SubsystemClient.MAX_ENERGY_UNITS);

        ShipReserve shipReserve = new ShipReserve(initialEnergyUnits);
        Assert.assertEquals(shipReserve.getEnergyPoints(), initialEnergyUnits);
        shipReserve.setDamaged();

        int energyUnits =  TestUtilities.getAnyIntInRange(SubsystemClient.MIN_ENERGY_UNITS, SubsystemClient.MAX_ENERGY_UNITS);
        shipReserve.setEnergyPoints(energyUnits);

        // Should not have changed
        Assert.assertEquals(shipReserve.getEnergyPoints(), initialEnergyUnits);
    }

    @Test
    public void testSetShipReserveEnergy() {

        ShipReserve shipReserve = new ShipReserve();
        int energyUnits =  TestUtilities.getAnyIntInRange(SubsystemClient.MIN_ENERGY_UNITS ,SubsystemClient.MAX_ENERGY_UNITS);

        shipReserve.setEnergyPoints(energyUnits);
        Assert.assertEquals(shipReserve.getEnergyPoints(), energyUnits);
    }
}
