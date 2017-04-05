package Utils;

import model.Shield;
import model.ShipReserve;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ahmedr3 on 4/5/2017.
 */
public class TransferUtilsTest {

    ShipReserve ship;
    Shield shield;

    @Before
    public void init() {
        ship = new ShipReserve(20);
        shield = new Shield(10 );
    }

    @Test
    public void testTransferFromShipToShield () {

        EnergyUtils.transferFromShipReservesToShield(ship, shield, 5);

        Assert.assertEquals(ship.getEnergyPoints(), 15);
        Assert.assertEquals(shield.getEnergyPoints(), 15);

    }
}
