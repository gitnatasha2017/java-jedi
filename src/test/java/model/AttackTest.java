package model;

import game.Game;
import game.Location;
import org.junit.*;

import java.awt.*;

public class AttackTest {

    @Test
    public void testAttackForShieldDownRandomDamage() {

        int numKlingons = 10;
        int numStarbases = 5;
        int numStarDates = 15;
        Location location = new Location(1, new Point(1,1));

        Game game = new Game(numKlingons, numStarbases, numStarDates, location);
        ShipReserve shipReserve = new ShipReserve();

        Attack attack = new Attack(game, shipReserve);
        attack.hitSystem(10005,8000);
        Assert.assertEquals(attack.getAttackResult(),"Damage");
    }

    @Test
    public void testAttackForShieldDownNoOtherDamage() {

        int numKlingons = 10;
        int numStarbases = 5;
        int numStarDates = 15;
        Location location = new Location(1, new Point(1,1));

        Game game = new Game(numKlingons, numStarbases, numStarDates, location);
        ShipReserve shipReserve = new ShipReserve();

        Attack attack = new Attack(game, shipReserve);
        attack.hitSystem(10000,10000);
        Assert.assertEquals(attack.getAttackResult(),"Down");
    }

    @Test
    public void testAttackForShieldStillUp() {

        int numKlingons = 10;
        int numStarbases = 5;
        int numStarDates = 15;
        Location location = new Location(1, new Point(1,1));

        Game game = new Game(numKlingons, numStarbases, numStarDates, location);
        ShipReserve shipReserve = new ShipReserve();

        Attack attack = new Attack(game, shipReserve);
        attack.hitSystem(4000,10000);
        Assert.assertEquals(attack.getAttackResult(),"Up");
    }

    @Test
    public void testRepeatAttackTillShieldDown() {
        int shieldEnergyPoints = 10000;

        int numKlingons = 10;
        int numStarbases = 5;
        int numStarDates = 15;
        Location location = new Location(1, new Point(1,1));

        Game game = new Game(numKlingons, numStarbases, numStarDates, location);
        ShipReserve shipReserve = new ShipReserve();

        Attack attack = new Attack(game, shipReserve);
        attack.hitSystem(1000,shieldEnergyPoints);
        shieldEnergyPoints = attack.getRemainingShiedEnergy();
        while (attack.getAttackResult() == "Up")  {
            attack.hitSystem(1000,shieldEnergyPoints);
            shieldEnergyPoints = attack.getRemainingShiedEnergy();
            if (shieldEnergyPoints < 0) break;
        }
        attack.hitSystem(1000,0);
    }


}
