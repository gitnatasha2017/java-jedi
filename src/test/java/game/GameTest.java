package game;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

/**
 * Created by ahmedr3 on 4/6/2017.
 */
public class GameTest {

    @Test
    public void testInitializeGame() {

        int numKlingons = 10;
        int numStarbases = 5;
        int numStarDates = 15;
        Location location = new Location(1, new Point(1,1));

        Game game = new Game(numKlingons, numStarbases, numStarDates, location);

        Assert.assertEquals(game.getLocation(), location);
        Assert.assertEquals(game.getNumKlingons(), numKlingons);
        Assert.assertEquals(game.getNumStarbases(), numStarbases);
        Assert.assertEquals(game.getNumStarDates(), numStarDates);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testInitializeGameInvalidLocation() {

        int numKlingons = 10;
        int numStarbases = 5;
        int numStarDates = 15;

        int numQuadrants = Galaxy.defaultQuadrantLength * Galaxy.defaultQuadrantWidth;

        Location location = new Location( numQuadrants + 20, new Point(1,1));
        Game game = new Game(numKlingons, numStarbases, numStarDates, location);

    }

    @Test(expected=IllegalArgumentException.class)
    public void testInitializeGameNullLocation() {

        int numKlingons = 10;
        int numStarbases = 5;
        int numStarDates = 15;
        Location location = null;

        Game game = new Game(numKlingons, numStarbases, numStarDates, location);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testInitializeGameInvalidNumKlingons() {

        int numKlingons = -10;
        int numStarbases = 5;
        int numStarDates = 15;
        Location location = null;

        Game game = new Game(numKlingons, numStarbases, numStarDates, location);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testInitializeGameInvalidNumStarbases() {

        int numKlingons = 10;
        int numStarbases = -5;
        int numStarDates = 15;
        Location location = null;

        Game game = new Game(numKlingons, numStarbases, numStarDates, location);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testInitializeGameInvalidNumStarDates() {

        int numKlingons = 10;
        int numStarbases = 5;
        int numStarDates = -15;
        Location location = null;

        Game game = new Game(numKlingons, numStarbases, numStarDates, location);
    }

}
