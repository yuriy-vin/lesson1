package OOP.Them2_8.MyShapes;

/**
 * Created by Yuriy on 18.02.2017.
 */
public class Triangle extends Shape {
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
        return super.toString();
    }

    @Override
    public void draw() {
        String resulttoString = this.toString();
        System.out.println(
                resulttoString +
                        ", a = " + this.a +
                        ", b = " + this.b +
                        ", c = " + this.c +
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
