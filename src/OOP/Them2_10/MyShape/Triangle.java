package OOP.Them2_10.MyShape;

import java.util.StringTokenizer;

/**
 * Created by Yuriy on 18.02.2017.
 */
public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String shapeName,String shapeColor, double a, double b, double c) {
        super(shapeName, shapeColor);
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
        return super.toString() +
                ":" + a +
                "," + b +
                "," + c;
    }

    @Override
    public void draw() {
        System.out.println("This is " + this.getClass().getSimpleName() + ":" +
                " color:" + getShapeColor() +
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

    public static Triangle parseTriangle (String inputString){
        StringTokenizer tokenizer = new StringTokenizer(inputString);
        String[]tokkens = new String[tokenizer.countTokens()];
        for (int i = 0; i < tokkens.length; i++) {
            tokkens[i] = tokenizer.nextToken();
        }
        return new Triangle (tokkens[0],tokkens[1],Double.parseDouble(tokkens[2]),Double.parseDouble(tokkens[3]),Double.parseDouble(tokkens[4]));
    }
}
