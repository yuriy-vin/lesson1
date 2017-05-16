package OOP.Them2_7.Lab2_7_6.MyShapes;

/**
 * Created by Yuriy on 17.02.2017.
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
        return super.toString() +
                ", width = " + width +
                ", height = " + height;
    }
}

