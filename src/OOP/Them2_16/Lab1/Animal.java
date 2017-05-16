package OOP.Them2_16.Lab1;

/**
 * Created by Yuriy on 13.03.2017.
 */
public class Animal {

}
 class Dog extends Animal{

}
class Main{
    static void foo(Animal a){
        System.out.println("Animal");
    }
    static void foo(Dog a){
        System.out.println("Dog");
    }
    static void foo(int i ){
        System.out.println("int");
    }
    static void foo(Byte b){
        System.out.println("Byte");
    }
    static void foo(int a, int b){
        System.out.println("a = " + a +" b = " + b);
    }
    static void foo(int... a){
        for(int i : a)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Animal a = new Dog();
        foo(a);

        byte b = 5;
        foo(b);

        foo(3,4);
        foo(5,6,7);





    }

}