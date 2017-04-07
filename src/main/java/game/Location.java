package game;

import java.awt.*;

/**
 * Created by ahmedr3 on 4/7/2017.
 */
public class Location {

    int quadrantNumber;
    Point sector;

    public Location(int quadrantNumber, Point sector) {
        this.quadrantNumber = quadrantNumber;
        this.sector = sector;
    }
    public int getQuadrantNumber() {
        return quadrantNumber;
    }

    public void setQuadrantNumber(int quadrantNumber) {
        this.quadrantNumber = quadrantNumber;
    }

    public Point getSector() {
        return sector;
    }

    public void setSector(Point p) {
        this.sector = sector;
    }

    public boolean isValidLocation(Grid grid, Location location) {
        return (grid.getQuadrants().contains(location)) ;
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || !(o instanceof Location)) {
            return false;
        }

        Location otherLocation = (Location) o;
        if ((otherLocation.quadrantNumber == this.quadrantNumber) &&
            (otherLocation.sector.equals(this.getSector())) ){
            return  true;
        }
        return false;
    }

    @Override
    public int hashCode() {

        int hashCode = 31;

        hashCode = hashCode + this.quadrantNumber * 31;
        hashCode = hashCode + this.sector.hashCode();

        return hashCode;
    }

}
