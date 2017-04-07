package model;

import game.Game;
import game.Location;
import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

/**
 * Created by ahmedr3 on 4/7/2017.
 */
public class ShipTest {

    @Test
    public void testCreateShip() {

        int numKlingons = 10;
        int numStarbases = 5;
        int numStarDates = 15;
        Location location = new Location(1, new Point(1,1));

        Game game = new Game(numKlingons, numStarbases, numStarDates, location);

        ShipReserve shipReserve = new ShipReserve();
        WarpEngine warpEngine = new WarpEngine(shipReserve, game);
        Shield shield = new Shield();

        Ship ship = new Ship(shipReserve, warpEngine, shield, location, game );

        Assert.assertNotNull(ship);
        Assert.assertEquals(ship.getLocation(), location);

    }
}
