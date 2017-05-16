package OOP.Them2_8.MyShapes;

import java.util.Comparator;

/**
 * Created by Yuriy on 18.02.2017.
 */
public abstract class Shape implements Comparable {

    private String shapeColor;

    public String getShapeColor() {return shapeColor;}

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public  abstract double calcArea();

    @Override
    public String toString() {
        return "This is " +
                this.getClass().getSimpleName() +
                ", color is " +
                shapeColor;
    }

    public void draw() {
        String resulttoString = this.toString();
        System.out.println(resulttoString);
    }
}
