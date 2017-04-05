package Utils;

import model.Shield;
import model.ShipReserve;

/**
 * Created by ahmedr3 on 4/5/2017.
 */
public class TransferUtils {

    public static boolean transferFromShipReservesToShield(ShipReserve shipReserve, Shield shield, int units) {

        int shipEnergyoints = shipReserve.getEnergyPoints();
        if (units > shipEnergyoints) {
            return false;
        }

        shipEnergyoints -= units;
        shipReserve.setEnergyPoints(shipEnergyoints);

        int shieldEnergyPoints = shield.getEnergyPoints();
        shield.setEnergyPoints(shieldEnergyPoints+units);

        return true;
    }

    public static void validateEnergyRange(int units) {

        if (units )
    }
}
