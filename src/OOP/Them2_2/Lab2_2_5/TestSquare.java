package OOP.Them2_2.Lab2_2_5;

/**
 * Created by Yuriy on 12.02.2017.
 */
public class TestSquare {
    public static void main(String[] args) {
        A a = new A();
        a.getA();
        a.calcSquare(5);

        A.calcSquare(5,7);
        A.calcSquare(5,"circle");
    }

}
