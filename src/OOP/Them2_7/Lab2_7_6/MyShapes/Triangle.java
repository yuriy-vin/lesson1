package OOP.Them2_7.Lab2_7_6.MyShapes;

/**
 * Created by Yuriy on 18.02.2017.
 */
public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcArea() {
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    @Override
    public String toString() {
        return super.toString()+
                ", a = " + a +
                ", b = " + b +
                ", c = " + c;
    }
}
