package Utils;

import model.Shield;
import model.ShipReserve;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

/**
 * Created by ahmedr3 on 4/5/2017.
 */
public class EnergyUtilsTest {

    ShipReserve ship;
    Shield shield;

    @Before
    public void init() {
        ship = new ShipReserve(200);
        shield = new Shield(100 );
    }

    @Test
    public void testTransferFromShipToShield () {

        boolean success = EnergyUtils.transferFromShipReservesToShield(ship, shield, 5);

        Assert.assertEquals(success, true);
        Assert.assertEquals(ship.getEnergyPoints(), 195);
        Assert.assertEquals(shield.getEnergyPoints(), 105);

    }

    /* Test transfer an amount more than max */
    @Test
    public void testInvalidHighTransferFromShipToShield () {

        int shipEnergyPoints = ship.getEnergyPoints();
        boolean success = EnergyUtils.transferFromShipReservesToShield(ship, shield,  EnergyUtils.MAX_ENERGY_UNITS + 1000);
        Assert.assertEquals(success, false);
        Assert.assertEquals(ship.getEnergyPoints(), shipEnergyPoints);
    }

     /* Test transfer an amount more than what the ship has */
    @Test
    public void testInvalidLowTransferFromShipToShield () {
        int shipEnergyPoints = ship.getEnergyPoints();
        int transferUnits = Math.min(shipEnergyPoints + 200, EnergyUtils.MAX_ENERGY_UNITS) ;
        boolean success = EnergyUtils.transferFromShipReservesToShield(ship, shield, transferUnits);
        Assert.assertEquals(success, false);
        Assert.assertEquals(ship.getEnergyPoints(), shipEnergyPoints);
    }

    @Test
    public void testTransferFromDamagedShipToShield () {

        ship.setDamaged();
        int transferUnits =  EnergyUtils.MIN_ENERGY_UNITS +
                (int)(Math.random() * (( EnergyUtils.MAX_ENERGY_UNITS - EnergyUtils.MIN_ENERGY_UNITS) + 1));

        boolean success = EnergyUtils.transferFromShipReservesToShield(ship, shield, transferUnits);

        Assert.assertEquals(success, false);
        /* Verify if original values */
        Assert.assertEquals(ship.getEnergyPoints(), 200 );
        Assert.assertEquals(shield.getEnergyPoints(), 100);

    }

}
