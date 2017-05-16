package OOP.Them2_12.Test;

/**
 * Created by Yuriy on 14.03.2017.
 */
public class Tour {
    public static void main(String[] args) {
        Cathedral c = new Cathedral();
        Cathedral.Sanctum s = c.new Sanctum();
        s.go();
    }
}
class Cathedral {
    class Sanctum {
        void go() {

            System.out.println("spooky");

        }
    }
}