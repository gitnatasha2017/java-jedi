package model;

import Utils.EnergyUtils;

/**
 * Created by ahmedr3 on 4/5/2017.
 */
public class ShipReserve {

    int energyPoints;


    public ShipReserve() {
        energyPoints = 0;
    }

    public ShipReserve(int energyPoints) {
        this.energyPoints = energyPoints;
    }

    public int getEnergyPoints() {
        return  energyPoints;
    }

    public void setEnergyPoints(int energyPoints) {

        if (EnergyUtils.isEnergyInRange(energyPoints)) {
            this.energyPoints = energyPoints;
        }
        this.energyPoints = energyPoints;
    }

}
