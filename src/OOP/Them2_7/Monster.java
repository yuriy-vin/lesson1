package OOP.Them2_7;

/**
 * Created by Yuriy on 18.02.2017.
 */
public class Monster {}
class Dragon extends Monster {

    public void say() {

        System.out.println("I'm a dragon");

    }

}

class Orc extends Monster {

    public void say() {

        System.out.println("I'm an orc");

    }

}
 class CastingExample {

    public static void main(String args[]) {

        Monster monster1 = new Dragon();

        Monster monster2 = new Orc();

        ( (Orc)monster1).say();

        ( (Dragon)monster2).say();

    }

}
