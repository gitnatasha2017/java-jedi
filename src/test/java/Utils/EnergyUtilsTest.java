package Utils;

import model.Shield;
import model.ShipReserve;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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

        EnergyUtils.transferFromShipReservesToShield(ship, shield, 5);
        Assert.assertEquals(ship.getEnergyPoints(), 195);
        Assert.assertEquals(shield.getEnergyPoints(), 105);

    }

    @Test
    public void testInvalidHighTransferFromShipToShield () {

        EnergyUtils.transferFromShipReservesToShield(ship, shield, 11000);
        //TODO
    }


}
