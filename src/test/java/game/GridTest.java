package game;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ahmedr3 on 4/7/2017.
 */
public class GridTest {

    @Test
    public void testCreateGrid() {

        Grid grid = new Grid();
        int defaultNumQuadrants = Grid.defaultQuadrantLength  * Grid.defaultQuadrantWidth;
        Assert.assertNotNull(grid.getQuadrants());
        Assert.assertEquals(grid.getQuadrants().size(), defaultNumQuadrants);
    }


    @Test
    public void testValidQuadrant() {


        int defaultNumQuadrants = Grid.defaultQuadrantLength  * Grid.defaultQuadrantWidth;
        int invalidQuadrantNumber = defaultNumQuadrants + 20;
        Grid grid = new Grid();
        boolean success = grid.isValidQuadrant(invalidQuadrantNumber);

        Assert.assertFalse(success);
    }
}
