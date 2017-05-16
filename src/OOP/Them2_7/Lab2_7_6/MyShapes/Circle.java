package OOP.Them2_7.Lab2_7_6.MyShapes;

/**
 * Created by Yuriy on 17.02.2017.
 */
public class Circle extends Shape {
    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", radius = " +
                radius;


    }
}
