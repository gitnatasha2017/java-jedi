package model;

import client.SubsystemClient;

/**
 * Created by ahmedr3 on 4/5/2017.
 */
public class ShipReserve extends SubSystem{

    int energyPoints;

    public ShipReserve() {
        energyPoints = SubsystemClient.MAX_ENERGY_UNITS;
    }

    public ShipReserve(int energyPoints) {
        this.energyPoints = energyPoints;
    }

    public int getEnergyPoints() {
        return  energyPoints;
    }

    public void setEnergyPoints(int energyPoints) {

        if (!isDamaged() && SubsystemClient.isEnergyInRange(energyPoints)) {
            this.energyPoints = energyPoints;
        }
    }

}
