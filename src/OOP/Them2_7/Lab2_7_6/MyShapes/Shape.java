package OOP.Them2_7.Lab2_7_6.MyShapes;

/**
 * Created by Yuriy on 17.02.2017.
 */
public  class Shape {
    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public  double calcArea(){
        return 0.0;
    };

    @Override
    public String toString() {
        return "This is " +
                this.getClass().getSimpleName() +
                ", color is " +
                shapeColor;
    }
}
