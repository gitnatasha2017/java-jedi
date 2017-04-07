package model;

import game.Galaxy;
import game.Game;
import game.Location;

/**
 * Created by ahmedr3 on 4/7/2017.
 */
public class Ship {

    final ShipReserve shipReserve;
    final WarpEngine warpEngine;
    final Shield shield;
    Game game = null;

    Location location;

    public Ship(ShipReserve shipReserve, WarpEngine warpEngine, Shield shield,
                Location location, Game game) {
            this.shipReserve = shipReserve;
            this.warpEngine = warpEngine;
            this.shield = shield;
            this.game = game;
            setLocation(location);
    }

    public Location getLocation() {
        return location;
    }

    public Game getGame() {
        return game;
    }

    public void setLocation(Location location) {

        if (location == null) {
            throw new IllegalArgumentException(" Location cannot be null");
        }
        this.location = location;
    }


    public ShipReserve getShipReserve() {
        return shipReserve;
    }

    public WarpEngine getWarpEngine() {
        return warpEngine;
    }

    public Shield getShield() {
        return shield;
    }


}