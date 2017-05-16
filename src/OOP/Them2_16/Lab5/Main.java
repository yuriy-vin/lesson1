package OOP.Them2_16.Lab5;

/**
 * Created by Yuriy on 13.03.2017.
 */
public class Main {
    static void foo(int i ){
        System.out.println("int");
    }
    static void foo(byte b){
        System.out.println("byte");
    }

    public static void main(String[] args) {
        byte b = 5;
        foo(b);
        foo(5);
    }
}
