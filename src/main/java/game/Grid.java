package game;

import java.awt.*;
import java.util.Set;

/**
 * Created by ahmedr3 on 4/7/2017.
 */
public class Grid {

    public Set<Quadrant> getQuadrants() {
        return quadrants;
    }

    public void setQuadrants(Set<Quadrant> quadrants) {
        this.quadrants = quadrants;
    }

    Set<Quadrant> quadrants;

    public static final int defaultQuadrantLength = 8;
    public static final int defaultQuadrantWidth = 8;

    public Grid() {

        int quadrantNumber = 1;
        for (int i=0; i < defaultQuadrantLength; i++) {
            for (int j= 0; j < defaultQuadrantWidth; j++) {
                Quadrant quadrant = new Quadrant(quadrantNumber);//todo
                quadrants.add(quadrant);
                quadrantNumber ++;
            }
        }
    }

    public Grid(int l, int w) {

        int quadrantNumber = 1;
        for (int i=0; i < l; i++) {
            for (int j= 0; j < w; j++) {
                Quadrant quadrant = new Quadrant(quadrantNumber);
                quadrants.add(quadrant);
                quadrantNumber ++;
            }
        }
    }

/*    public boolean isValidLocation(Point p) {
        if (quadrant.contains(p)) {
            return true;
        }
        return false;
    } */


}
