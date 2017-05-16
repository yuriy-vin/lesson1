package OOP.Them2_7;

/**
 * Created by Yuriy on 18.02.2017.
 */
class Animal {

    void jump() {

        System.out.println("Animal");

    }

}

class Cat extends Animal {

    void jump(int a) {

        System.out.println("Cat");

    }

}

class Rabbit extends Animal {

    void jump() {

        System.out.println("Rabbit");

    }

}

class Circus {

    public static void main(String args[]) {

        Animal cat = new Cat();

        Rabbit rabbit = new Rabbit();

        cat.jump();

        rabbit.jump();

    }

}
