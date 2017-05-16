package OOP.Them2_2.Lab2_2_5;

/**
 * Created by Yuriy on 12.02.2017.
 */
public class A {
    int a;
    int getA(){return this.a;}
    public void calcSquare(double a){
        double square = a * a;
        System.out.println("Square of rectangle is "+ square );
    }
    public static void calcSquare(double a, double b){
        double square = a * b;
        System.out.println("Square of fourtangle is "+ square );
    }
    public static void calcSquare(double r,String s){
        double square = 3.14 * r * r;
        System.out.println("Square of circle is "+ square );
    }
}
