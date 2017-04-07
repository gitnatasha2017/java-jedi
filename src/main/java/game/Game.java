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


    public Galaxy getGalaxy() {
        return galaxy;
    }

    public void setGalaxy(Galaxy galaxy) {
        this.galaxy = galaxy;
    }

    public Game(int numKlingons, int numStarbases, int numStarDates, Location location) {

        this.galaxy = new Galaxy();

        if (numKlingons <= 0 || numStarbases <= 0 || numStarDates <= 0) {
            throw new IllegalArgumentException("Invalid number of Klingtons, star bases or stardates");
        }
        setNumKlingons(numKlingons);
        setNumStarbases(numStarbases);
        setNumStarDates(numStarDates);
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

        if (!galaxy.isValidLocation(location)) {
            throw new IllegalArgumentException(" Location is not valid");
        }

        this.location = location;
    }
}
