package OOP.Them2_10.MyShape;

import java.util.StringTokenizer;

/**
 * Created by Yuriy on 18.02.2017.
 */
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String shapeName,String shapeColor, double width, double height) {
        super(shapeName, shapeColor);
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
                ":" + width +
                "," + height;
    }

    @Override
    public void draw() {
        System.out.println("This is " + this.getClass().getSimpleName() + ":" +
                " color:" + getShapeColor() +
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

    public static Rectangle parseRectangle (String inputString){
        StringTokenizer tokenizer = new StringTokenizer(inputString);
        String[]tokkens = new String[tokenizer.countTokens()];
        for (int i = 0; i < tokkens.length; i++) {
            tokkens[i] = tokenizer.nextToken();
        }
        return new Rectangle(tokkens[0],tokkens[1],Double.parseDouble(tokkens[2]),Double.parseDouble(tokkens[3]));
    }
}
