package model;

import game.Galaxy;
import game.Location;

/**
 * Created by ahmedr3 on 4/7/2017.
 */
public class Ship {

    final ShipReserve shipReserve;
    final WarpEngine warpEngine;
    final Shield shield;
    Location location;

    public Ship(ShipReserve shipReserve, WarpEngine warpEngine, Shield shield,
                Location location) {
            this.shipReserve = shipReserve;
            this.warpEngine = warpEngine;
            this.shield = shield;
            setLocation(location);
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