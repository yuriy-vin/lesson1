package OOP.Them2_7;

/**
 * Created by Yuriy on 18.02.2017.
 */
public class A {
    void doIt()  {

        System.out.println("A");

    }

}

 class B extends A {

    void doIt() {

        System.out.println("B");

    }

    public static void main(String[] args) {

        B b = new B();

        b.go();

    }

    void go() {

        super.doIt();

    }

}
