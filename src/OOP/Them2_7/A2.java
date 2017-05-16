package OOP.Them2_7;

/**
 * Created by Yuriy on 18.02.2017.
 */
public class A2 {
    int i = 3;

}

class B2 extends A2 {

    int i = 4;

}

class Main2 {

    public static void main(String[] args) {

        A2 a = new B2();

        B2 d = new B2();

        System.out.print(a.i + " " + d.i);

    }

}
