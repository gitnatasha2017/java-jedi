package game;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ahmedr3 on 4/7/2017.
 */
public class QuadrantTest {

    @Test
    public void testCreateQuadrant() {

        int quadrantNumber = 10;
        Quadrant quadrant = new Quadrant(10);

        int defaultSectorSize = Quadrant.defaultSectorLength * Quadrant.defaultSectorWidth;
        Assert.assertEquals(quadrant.getQuadrantNumber(), quadrantNumber);
        Assert.assertEquals(quadrant.sectors.size(), defaultSectorSize);
    }
}
