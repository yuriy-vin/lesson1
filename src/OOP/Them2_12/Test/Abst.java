package OOP.Them2_12.Test;

/**
 * Created by Yuriy on 14.03.2017.
 */
abstract class Abst {
    abstract Abst mm();
}
class Outer {
    Abst mm() {
        class Inner extends Abst {
            Abst mm() {
                System.out.println("Inner ");
                return  new Inner();
            }
        }
        return  new Inner();
    }
}
 class DemoInner {
    public static void main(String [] a) {
        Outer obj = new Outer();
        Abst aa = obj.mm();
        aa.mm();
    }
}
