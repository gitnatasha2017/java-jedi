package game;

import java.awt.*;
import java.util.Set;

public class Quadrant {

    /* Quadrant identified by a quadrant number */
    int quadrantNumber;
    Set<Point> sectors;

    public int getQuadrantNumber() {
        return quadrantNumber;
    }

    public void setQuadrantNumber(int quadrantNumber) {
        this.quadrantNumber = quadrantNumber;
    }

    public Set<Point> getSectors() {
        return sectors;
    }

    public void setSectors(Set<Point> sectors) {
        this.sectors = sectors;
    }

    public static final int defaultSectorLength = 10;
    public static final int defaultSectorWidth = 10;

    public Quadrant(int quadrantNumber) {
        this.quadrantNumber = quadrantNumber;
        for (int i=0; i < defaultSectorLength; i++) {
            for (int j= 0; j < defaultSectorWidth; j++) {
                Point sector = new Point(i,j);

                sectors.add(sector);
            }
        }
    }

    public Quadrant(int quadrantNumber, int l, int w) {
        this.quadrantNumber = quadrantNumber;
        for (int i=0; i < l; i++) {
            for (int j= 0; j < w; j++) {
                Point point = new Point(i,j);

                sectors.add(point);
            }
        }
    }

    public boolean isValidSector(Point p) {
        if (sectors.contains(p)) {
            return true;
        }
        return false;
    }

}
