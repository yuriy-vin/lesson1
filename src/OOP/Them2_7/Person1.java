package OOP.Them2_7;

/**
 * Created by Yuriy on 18.02.2017.
 */
public class Person1 {
    String name;

}

class SuperMan extends Person1 {

    String skils;

    SuperMan(String skils, String name) {

        super();

        this.skils = skils;

    }

    public String toString() {

        return name + " has " + skils;

    }

}

 class Main1 {

    public static void main(String[] args) {

        SuperMan superMan = new SuperMan("super vision", "Clark Kent");

        System.out.print(superMan);

    }

}
