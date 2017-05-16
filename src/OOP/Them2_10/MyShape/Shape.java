package OOP.Them2_10.MyShape;

import java.util.StringTokenizer;

/**
 * Created by Yuriy on 18.02.2017.
 */
public abstract class Shape implements Comparable,Drawable {

    private String shapeName;
    private String shapeColor;

    public Shape(){};
    public Shape(String shapeName,String shapeColor) {
        this.shapeName = this.getClass().getSimpleName();
        this.shapeColor = shapeColor;
    }
    public String getShapeName() {return shapeName;}
    public String getShapeColor() {return shapeColor;}

    public  abstract double calcArea();

    @Override
    public String toString() {
        return  this.getClass().getSimpleName() + ":" +
                shapeColor;
    }

    public void draw() {
        System.out.println("This is " + this.getClass().getSimpleName() + ":" +
                " color:" + shapeColor);
    }


    public static Shape parseShape (String inputString) throws InvalidShapeStringException{
        StringTokenizer token = new StringTokenizer(inputString);
        switch (token.nextToken()){
            case "Circle":
              return   Circle.parseCircle(inputString);
            case "Rectangle":
              return   Rectangle.parseRectangle(inputString);
            case "Triangle":
             return   Triangle.parseTriangle(inputString);
            default: throw new InvalidShapeStringException();
        }
    }
}
