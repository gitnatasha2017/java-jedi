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
}
