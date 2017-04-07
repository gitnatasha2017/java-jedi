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

        int defaultSectorSize = Quadrant.DEFAULT_SECTOR_LENGTH * Quadrant.DEFAULT_SECTOR_WIDTH;
        Assert.assertEquals(quadrant.getQuadrantNumber(), quadrantNumber);
        Assert.assertEquals(quadrant.sectors.size(), defaultSectorSize);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateInvalidQuadrant() {

        int quadrantNumber = -1;
        Quadrant quadrant = new Quadrant( quadrantNumber);
    }

    @Test
    public void testQuadrantsEquality() {
        int quadrantNumber = 10;
        Quadrant quadrant1 = new Quadrant(10);
        Quadrant quadrant2 = new Quadrant(10, Quadrant.DEFAULT_SECTOR_LENGTH, Quadrant.DEFAULT_SECTOR_WIDTH);

        Assert.assertEquals(quadrant1, quadrant2);
    }

    @Test
    public void testQuadrantsInequalityByQuandrantNumber() {

        int quadrantNumber = 10;
        Quadrant quadrant1 = new Quadrant(10);
        Quadrant quadrant2 = new Quadrant(20, Quadrant.DEFAULT_SECTOR_LENGTH, Quadrant.DEFAULT_SECTOR_WIDTH);

        Assert.assertNotEquals(quadrant1, quadrant2);
    }

    @Test
    public void testQuadrantsInequalityBySize() {

        int quadrantNumber = 10;
        Quadrant quadrant1 = new Quadrant(10);

        int l = Quadrant.DEFAULT_SECTOR_LENGTH + 20;
        int w = Quadrant.DEFAULT_SECTOR_WIDTH + 10;

        Quadrant quadrant2 = new Quadrant(10, l, w);

        Assert.assertNotEquals(quadrant1, quadrant2);
    }

}
