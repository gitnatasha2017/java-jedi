package model;

import Utils.EnergyUtils;

/**
 * Created by ahmedr3 on 4/5/2017.
 */
public class Shield {

    int energyPoints;

    public Shield() {
        energyPoints = EnergyUtils.MAX_ENERGY_UNITS;
    }

    public Shield(int energyPoints) {
        this.energyPoints = energyPoints;
    }

    boolean down;

    public boolean isDown() {
        return  down;
    }

    public void raiseShield() {
        down = false;
    }

    public void lowerShield() {
        down = true;
    }

    public int getEnergyPoints() {
        return  energyPoints;
    }

    public void setEnergyPoints(int energyPoints) {
        if (EnergyUtils.isEnergyInRange(energyPoints)) {
            this.energyPoints = energyPoints;
        }
    }

}
