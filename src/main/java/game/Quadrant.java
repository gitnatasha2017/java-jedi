package game;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class Quadrant {

    public static final int DEFAULT_SECTOR_LENGTH = 10;
    public static final int DEFAULT_SECTOR_WIDTH = 10;

    /* Quadrant identified by a quadrant number */
    int quadrantNumber;
    final Set<Point> sectors;

    public Quadrant(int quadrantNumber) {

        setQuadrantNumber(quadrantNumber);
        sectors = new HashSet<Point>();
        for (int i = 0; i < DEFAULT_SECTOR_LENGTH; i++) {
            for (int j = 0; j < DEFAULT_SECTOR_WIDTH; j++) {
                Point sector = new Point(i,j);

                sectors.add(sector);
            }
        }
    }

    public Quadrant(int quadrantNumber, int l, int w) {
        this.quadrantNumber = quadrantNumber;
        sectors = new HashSet<Point>();
        for (int i=0; i < l; i++) {
            for (int j= 0; j < w; j++) {
                Point point = new Point(i,j);
                sectors.add(point);
            }
        }
    }

    public int getQuadrantNumber() {
        return quadrantNumber;
    }

    public void setQuadrantNumber(int quadrantNumber) {

        if (quadrantNumber <= 0) {
            throw new IllegalArgumentException("Invaid quadrant number specified.");
        }
        this.quadrantNumber = quadrantNumber;
    }

    public Set<Point> getSectors() {
        return sectors;
    }

    public boolean isValidSector(Point p) {
        if (sectors.contains(p)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || !(o instanceof Quadrant)) {
            return false;
        }

        Quadrant otherQuadrant = (Quadrant) o;
        if ((otherQuadrant.quadrantNumber == this.quadrantNumber) &&
                (otherQuadrant.sectors.equals(this.sectors)) ){
            return  true;
        }
        return false;
    }

    @Override
    public int hashCode() {

        int hashCode = 31;

        hashCode = hashCode + this.quadrantNumber * 31;
        hashCode = hashCode + this.sectors.hashCode();

        return hashCode;
    }

}
