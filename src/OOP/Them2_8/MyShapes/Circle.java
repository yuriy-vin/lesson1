package OOP.Them2_8.MyShapes;

/**
 * Created by Yuriy on 18.02.2017.
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
        return super.toString();
    }
    @Override
    public void draw() {
        String resulttoString = this.toString();
        System.out.println(
                resulttoString +
                ", radius = " + this.radius +
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
