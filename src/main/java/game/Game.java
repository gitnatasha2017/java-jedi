package game;

import model.Shield;
import model.Ship;
import model.ShipReserve;
import model.WarpEngine;

import java.awt.*;

/**
 * Created by ahmedr3 on 4/6/2017.
 */
public class Game {

    final Galaxy galaxy;
    int numKlingons;
    int numStarbases;
    int numStarDates;
    Ship ship;

    public Game(int numKlingons, int numStarbases, int numStarDates, Location location) {

        this.galaxy = new Galaxy();

        if (numKlingons <= 0 || numStarbases <= 0 || numStarDates <= 0) {
            throw new IllegalArgumentException("Invalid number of Klingtons, star bases or stardates");
        }
        setNumKlingons(numKlingons);
        setNumStarbases(numStarbases);
        setNumStarDates(numStarDates);

        checkValidLocation(location);
        Ship ship = createShip(location);
        this.setShip(ship);
    }

    public Game(Galaxy galaxy, int numKlingons, int numStarbases, int starDates,
                Location location) {

        this.galaxy = galaxy;
        setNumKlingons(numKlingons);
        setNumStarbases(numStarbases);
        setNumStarDates(starDates);

        Ship ship = createShip(location);
        this.setShip(ship);
    }

    private Ship createShip(Location location) {

        ShipReserve shipReserve = new ShipReserve();
        WarpEngine warpEngine = new WarpEngine(shipReserve, this);
        Shield shield = new Shield();

        return new Ship(shipReserve, warpEngine, shield, location, this);
   }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public Galaxy getGalaxy() {
        return galaxy;
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
        return ship.getLocation();
    }


    public void checkValidLocation(Location location) {

        if (location == null) {
            throw new IllegalArgumentException(" Location cannot be null");
        }

        if (!galaxy.isValidLocation(location)) {
            throw new IllegalArgumentException(" Location is not valid");
        }


    }
    public void setLocation(Location location) {

        if (location == null) {
            throw new IllegalArgumentException(" Location cannot be null");
        }

        if (!galaxy.isValidLocation(location)) {
            throw new IllegalArgumentException(" Location is not valid");
        }

        ship.setLocation(location);
    }


}
