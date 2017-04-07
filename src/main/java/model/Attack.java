package model;
import game.Game;

import java.util.Random;

public class Attack {

    String attackResult;
    int remShieldEnergy;
    ShipReserve shipReserve;
    Game game;

    public Attack(Game game, ShipReserve shipReserve) {
        this.shipReserve = shipReserve;
        this.game = game;
    }
    public String getAttackResult() {
        return attackResult;
    }

    public int getRemainingShiedEnergy() {
        return remShieldEnergy;
    }

    public void hitSystem(int energyPoints,int shieldEnergyPoints) {
        Shield shield = new Shield(shieldEnergyPoints);
        shield.raiseShield();
        remShieldEnergy = shield.getEnergyPoints() - energyPoints;

        shield.setEnergyPoints(remShieldEnergy);
        //System.out.println(shield.getEnergyPoints());
        if (remShieldEnergy == 0) {
            System.out.println("Attack - Shield is down");
            shield.setDamaged();
            attackResult = "Down";
        }
        else if (remShieldEnergy > 0) {
            System.out.println("Attack - Shield is Still Up");
            attackResult = "Up";
        }
        else {
            shield.setDamaged();
            if (returnRandom() == 0) {
                WarpEngine warpengine = new WarpEngine(shipReserve, game);
                warpengine.setDamaged();
            }
            else {
                Weapons weapons = new Weapons();
                weapons.setDamaged();
            }
            System.out.println("Attack - Shield is down; Subsystem also damaged");
            attackResult = "Damage";
        }

    }

    public int returnRandom() {
        Random random = new Random();
        return random.nextInt()%2;
    }

}
