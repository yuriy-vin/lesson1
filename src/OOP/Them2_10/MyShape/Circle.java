package OOP.Them2_10.MyShape;

import java.util.StringTokenizer;

/**
 * Created by Yuriy on 18.02.2017.
 */
public class Circle extends Shape {
    private double radius;

    public Circle(String shapeName, String shapeColor, double radius) {
        super(shapeName,shapeColor);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return super.toString() +
                ":" + radius;
    }
    @Override
    public void draw() {
        System.out.println("This is " + this.getClass().getSimpleName() + ":" +
                " color:" + getShapeColor() +
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

    public static Circle parseCircle (String inputString){
        StringTokenizer tokenizer = new StringTokenizer(inputString);
        String[]tokkens = new String[tokenizer.countTokens()];
        for (int i = 0; i < tokkens.length; i++) {
            tokkens[i] = tokenizer.nextToken();
        }
        return new Circle(tokkens[0],tokkens[1],Double.parseDouble(tokkens[2]));
    }
}
