package OOP.Them2_8.MyShapes;

import java.util.Comparator;

/**
 * Created by Yuriy on 18.02.2017.
 */
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void draw() {
        String resulttoString = this.toString();
        System.out.println(
                resulttoString +
                        ", width = " + this.width +
                        ", height = " + this.height +
                        ", area is: " + this.calcArea());
    }

    @Override
    public int compareTo(Object o) {
        Shape shape = (Shape) o;
        if(this.calcArea() > shape.calcArea()) return 1;
        if(this.calcArea() < shape.calcArea()) return -1;
        return 0;
    }

}
