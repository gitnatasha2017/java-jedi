package model;

/**
 * Created by ahmedr3 on 4/5/2017.
 */
public class Shield {

    boolean down;

    public boolean isDown() {
        return  down;
    }

    public void raiseShield() {
        down = false;
    }

    public void lowerShield() {
        down = true;
    }

}
