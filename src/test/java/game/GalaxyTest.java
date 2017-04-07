package game;

import model.TestUtilities;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ahmedr3 on 4/7/2017.
 */
public class GalaxyTest {

    @Test
    public void testCreateGalaxy() {

        Galaxy galaxy = new Galaxy();
        int defaultNumQuadrants = Galaxy.defaultQuadrantLength  * Galaxy.defaultQuadrantWidth;
        Assert.assertNotNull(galaxy.getQuadrants());
        Assert.assertEquals(galaxy.getQuadrants().size(), defaultNumQuadrants);
    }

    @Test
    public void testCreateGalaxyWithSpecifiedSize() {

        int l = 20; int w = 20;
        Galaxy galaxy = new Galaxy(l,w);
        Assert.assertNotNull(galaxy.getQuadrants());
        Assert.assertEquals(galaxy.getQuadrants().size(), l*w);
    }

    @Test
    public void testValidQuadrant() {

        int defaultNumQuadrants = Galaxy.defaultQuadrantLength  * Galaxy.defaultQuadrantWidth;
        int invalidQuadrantNumber = defaultNumQuadrants + 20;
        Galaxy galaxy = new Galaxy();
        boolean success = galaxy.isValidQuadrant(invalidQuadrantNumber);

        Assert.assertFalse(success);
    }

    @Test
    public void testGetQuadrantByQuadrantNumber() {

        Galaxy galaxy = new Galaxy();
        int numQuads = galaxy.getNumQuadrantsInGalaxy();
        int quadrantNumber = TestUtilities.getAnyIntInRange(1,numQuads);

        Quadrant quadrant = galaxy.getQuadrantByQuadrantNumber(quadrantNumber);
        Assert.assertNotNull(quadrant);
    }

    @Test
    public void testGetNumQuadrantsInGalaxy() {

        int defaultNumQuadrants = Galaxy.defaultQuadrantLength  * Galaxy.defaultQuadrantWidth;

        Galaxy galaxy = new Galaxy();
        int numQuadrants = galaxy.getNumQuadrantsInGalaxy();
        Assert.assertEquals(numQuadrants, defaultNumQuadrants);
    }

}
