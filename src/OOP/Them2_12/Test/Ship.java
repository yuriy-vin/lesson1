package OOP.Them2_12.Test;

/**
 * Created by Yuriy on 12.03.2017.
 */
class Ship{
 private int x=10;

    public int getX() {
        return x;
    }

    protected class Engine{
    public void test() {
        int x = 100;
        Ship.this.x = 20;
        System.out.println(x);
    }
 }
}


class Main{
    public static void main(String[] args) {
        Ship ship = new Ship();
        System.out.println(ship.getX());
        Ship.Engine engine = ship.new Engine();
        engine.test();
        System.out.println(ship.getX());
    }
}
