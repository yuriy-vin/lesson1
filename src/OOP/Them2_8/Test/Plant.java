package OOP.Them2_8.Test;

/**
 * Created by Yuriy on 20.02.2017.
 */
  abstract class Plant {
    abstract String growthDirection();
}
class Embryophyta extends Plant {
    String growthDirection() {   return "Up ";   }
}
class Carrot extends Embryophyta {
    String growthDirection() {   return "Down ";  }
}
 class Garden {
    public static void main(String[] args) {
        Embryophyta e = new Embryophyta();
        Embryophyta c = new Carrot();
        System.out.print(e.growthDirection() + c.growthDirection());
    }
}
