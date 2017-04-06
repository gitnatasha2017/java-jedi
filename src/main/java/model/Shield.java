package model;

import client.SubsystemClient;

/**
 * Created by ahmedr3 on 4/5/2017.
 */
public class Shield extends SubSystem {

    int energyPoints;
    boolean down;

    public Shield() {
        down = true;
        energyPoints = SubsystemClient.MAX_ENERGY_UNITS;
    }

    public Shield(int energyPoints) {
        down = true;
        this.energyPoints = energyPoints;
    }

    public boolean isDown() {
        return  down;
    }

    public void raiseShield() {
        if (!isDamaged()) {
            down = false;
        } else {
            down = true;
        }
    }

    @Override
    public void setDamaged() {
        super.setDamaged();
        lowerShield();
    }

    public void lowerShield() {
        down = true;
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
