package game;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

/**
 * Created by ahmedr3 on 4/7/2017.
 */
public class LocationTest {

    @Test
    public void testCreateLocation() {
        int quadrantNumber = 10;
        Point sector = new Point(10,20);
        Location location = new Location(quadrantNumber, sector);

        Assert.assertEquals(location.getQuadrantNumber(), quadrantNumber);
        Assert.assertEquals(location.getSector(), sector);
    }


    @Test
    public void testLocationEquality() {
        int quadrantNumber = 10;
        Point sector = new Point(20,20);
        Location location1 = new Location(quadrantNumber, sector);
        Location location2 = new Location(quadrantNumber, sector);

        Assert.assertEquals(location1, location2);
    }

    @Test
    public void testLocationInequalityByQuandrantNumber() {

        int quadrantNumber = 10;

        Point sector = new Point(20,20);
        Location location1 = new Location(quadrantNumber, sector);
        Location location2 = new Location(quadrantNumber+10, sector);

        Assert.assertNotEquals(location1, location2);
    }

    @Test
    public void testLocationInequalityBySector() {

        int quadrantNumber = 10;
        Point sector1 = new Point(20,20);
        Point sector2 = new Point(10,10);

        Location location1 = new Location(quadrantNumber, sector1);
        Location location2 = new Location( quadrantNumber, sector2);

        Assert.assertNotEquals(location1, location2);
    }

}
