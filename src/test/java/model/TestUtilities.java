package model;

/**
 * Created by ahmedr3 on 4/7/2017.
 */
public class TestUtilities {

    public static int getAnyIntInRange(int low, int high) {

        return low + (int)(Math.random() * (high - low) + 1);

    }
}
