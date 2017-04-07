package game;

import java.awt.Point;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ahmedr3 on 4/7/2017.
 */
public class Galaxy {

    public Set<Quadrant> getQuadrants() {
        return quadrants;
    }

    public void setQuadrants(Set<Quadrant> quadrants) {
        this.quadrants = quadrants;
    }

    Set<Quadrant> quadrants;

    public static final int defaultQuadrantLength = 8;
    public static final int defaultQuadrantWidth = 8;

    public Galaxy() {

        int quadrantNumber = 1;
        quadrants = new HashSet<Quadrant>();
        for (int i=0; i < defaultQuadrantLength; i++) {
            for (int j= 0; j < defaultQuadrantWidth; j++) {
                Quadrant quadrant = new Quadrant(quadrantNumber);//todo
                quadrants.add(quadrant);
                quadrantNumber ++;
            }
        }
    }

    public Galaxy(int l, int w) {

        int quadrantNumber = 1;
        quadrants = new HashSet<Quadrant>();
        for (int i=0; i < l; i++) {
            for (int j= 0; j < w; j++) {
                Quadrant quadrant = new Quadrant(quadrantNumber);
                quadrants.add(quadrant);
                quadrantNumber ++;
            }
        }
    }

    public int getNumQuadrantsInGalaxy() {
        return quadrants.size();
    }

    public Quadrant getQuadrantByQuadrantNumber(int quadrantNumber) {

        for (Quadrant quadrant : quadrants ) {

            if (quadrant.getQuadrantNumber() == quadrantNumber) {
                return quadrant;
            }
        }

        return null;
    }

    public boolean isValidQuadrant(int quadrantNumber) {

        Set<Integer> quadrantNumbers = new HashSet<Integer>();

        for (Quadrant q : quadrants) {
            quadrantNumbers.add(q.getQuadrantNumber());
        }
        if (quadrantNumbers.contains(quadrantNumber)) {
            return true;
        }
        return false;
    }

    public boolean isValidSector(Quadrant quadrant, Point pSector) {

        if (pSector == null) {
            return false;
        }

        if (!quadrant.isValidSector(pSector)) {
            return false;
        }
        return true;
    }

    public boolean isValidLocation(Location location) {

        int quadrantNumber = location.getQuadrantNumber();
        Point sector = location.sector;

        if (!isValidQuadrant(quadrantNumber)) {
            return false;
        }
        Quadrant quadrant = getQuadrantByQuadrantNumber(location.getQuadrantNumber());
        if (!isValidSector(quadrant, location.getSector())) {
            return false;
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || !(o instanceof Galaxy)) {
            return false;
        }

        Galaxy otherGalaxy = (Galaxy) o;
        if ((otherGalaxy.quadrants.equals(this.quadrants)) ){
            return  true;
        }
        return false;
    }

    @Override
    public int hashCode() {

        int hashCode = 31;

        hashCode = hashCode + this.quadrants.hashCode() * 31;

        return hashCode;
    }

}
