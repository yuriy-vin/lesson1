package OOP.Them2_3;

/**
 * Created by Yuriy on 04.02.2017.
 */
public class MyWindow {
    double width;
    double height;
    int numberOfGlass;
    String color;
    boolean isOpen;

    public MyWindow(){};

    public MyWindow(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public MyWindow(double width, double height, int numberOfGlass) {
        this(width,height);
        this.numberOfGlass = numberOfGlass;
    }

    public MyWindow(double width, double height, int numberOfGlass, String color) {
        this(width,height,numberOfGlass);
        this.color = color;
    }

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this(width,height,numberOfGlass,color);
        this.isOpen = isOpen;
    }


    public void printFields() {
        System.out.println(
                " width " + width
                        + " height " + height
                        + " numberOfGlass " + numberOfGlass
                        + " color " + color
                        + " isOpen " + isOpen);
    }

    public static void main(String[] args) {
        MyWindow[]array = new MyWindow[4];
        array[0] = new MyWindow(2.5,3.5);
        array[1] = new MyWindow(2,6,3);
        array[2] = new MyWindow(2, 2, 2, "black");
        array[3] = new MyWindow(3.4, 2, 2, "black", true);

        for (int i=0; i < array.length; i++){
            array[i].printFields();
        }
    }
}