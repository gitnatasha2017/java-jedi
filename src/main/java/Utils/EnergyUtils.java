package Utils;

import model.Shield;
import model.ShipReserve;

/**
 * Created by ahmedr3 on 4/5/2017.
 */
public class EnergyUtils {

    public static final int MIN_ENERGY_UNITS = 0;
    public static final int MAX_ENERGY_UNITS = 10000;

    public static boolean transferFromShipReservesToShield(ShipReserve shipReserve, Shield shield, int units) {

        int shipEnergyoints = shipReserve.getEnergyPoints();
        if (units > shipEnergyoints) {
            return false;
        }

        shipEnergyoints -= units;
        shipReserve.setEnergyPoints(shipEnergyoints);

        int shieldEnergyPoints = shield.getEnergyPoints() + units;

        if (shieldEnergyPoints > MAX_ENERGY_UNITS) {
            shieldEnergyPoints = MAX_ENERGY_UNITS;
        }
        boolean isValid = isEnergyInRange(shieldEnergyPoints);

        if (!isValid) {
            return false;
        }

        shield.setEnergyPoints(shieldEnergyPoints+units);

        return true;
    }

    public static boolean isEnergyInRange(int units) {

        if (units < MIN_ENERGY_UNITS || units > MAX_ENERGY_UNITS) {
            return  false;
        }

        return true;
    }


}
