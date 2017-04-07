package game;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ahmedr3 on 4/7/2017.
 */
public class GalaxyTest {

    @Test
    public void testCreateGrid() {

        Galaxy galaxy = new Galaxy();
        int defaultNumQuadrants = Galaxy.defaultQuadrantLength  * Galaxy.defaultQuadrantWidth;
        Assert.assertNotNull(galaxy.getQuadrants());
        Assert.assertEquals(galaxy.getQuadrants().size(), defaultNumQuadrants);
    }


    @Test
    public void testValidQuadrant() {


        int defaultNumQuadrants = Galaxy.defaultQuadrantLength  * Galaxy.defaultQuadrantWidth;
        int invalidQuadrantNumber = defaultNumQuadrants + 20;
        Galaxy galaxy = new Galaxy();
        boolean success = galaxy.isValidQuadrant(invalidQuadrantNumber);

        Assert.assertFalse(success);
    }
}
