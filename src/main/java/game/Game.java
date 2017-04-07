package game;

import java.awt.*;

/**
 * Created by ahmedr3 on 4/6/2017.
 */
public class Game {

    Galaxy galaxy;
    int numKlingons;
    int numStarbases;
    int numStarDates;
    Location location;


    public Game(int numKlingons, int numStarbases, int starDates, Location location) {

        this.galaxy = new Galaxy();
        setNumKlingons(numKlingons);
        setNumStarbases(numStarbases);
        setNumStarDates(starDates);
        setLocation(location);
    }


    public Game(Galaxy galaxy, int numKlingons, int numStarbases, int starDates, Location location) {

        this.galaxy = galaxy;
        setNumKlingons(numKlingons);
        setNumStarbases(numStarbases);
        setNumStarDates(starDates);
        setLocation(location);
    }

    public int getNumKlingons() {
        return numKlingons;
    }

    public void setNumKlingons(int numKlingons) {
        this.numKlingons = numKlingons;
    }

    public int getNumStarbases() {
        return numStarbases;
    }

    public void setNumStarbases(int numStarbases) {
        this.numStarbases = numStarbases;
    }

    public int getNumStarDates() {
        return numStarDates;
    }

    public void setNumStarDates(int numStarDates) {
        this.numStarDates = numStarDates;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {

        if (location == null) {
            throw new IllegalArgumentException(" Location cannot be null");
        }
        this.location = location;
    }
}
