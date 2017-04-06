package Utils;

import model.Shield;
import model.ShipReserve;

/**
 * Created by ahmedr3 on 4/5/2017.
 */
public class SubsystemClient {

    public static final int MIN_ENERGY_UNITS = 0;
    public static final int MAX_ENERGY_UNITS = 10000;

    public boolean transferFromShipReservesToShield(ShipReserve shipReserve, Shield shield, int units) {

        if (shipReserve.isDamaged() || shield.isDamaged()) {
            return false;
        }
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

        shield.setEnergyPoints(shieldEnergyPoints);

        return true;
    }

    public static boolean isEnergyInRange(int units) {

        if (units < MIN_ENERGY_UNITS || units > MAX_ENERGY_UNITS) {
            return  false;
        }

        return true;
    }


}
