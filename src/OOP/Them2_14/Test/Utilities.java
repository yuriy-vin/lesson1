package OOP.Them2_14.Test;

/**
 * Created by Yuriy on 11.04.2017.
 */
public class Utilities {
    public static <T> void fill(T[] obarr, T val) {
        for (int i = 0; i < obarr.length; i++)
            obarr[i] = val;
    }
}
class UtilitiesTest {
    public static void main(String[] args) {
        Integer[] obarr = new Integer[2];
        Utilities.fill(obarr, 5);
        for (Integer s : obarr)
            System.out.print(s);
    }
}
