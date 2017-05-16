package OOP.Them2_8.MyShapes;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;

/**
 * Created by Yuriy on 18.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        double sumArea = 0;
        double sumRectArea = 0;
        double sumTriangleArea = 0;
        double sumCircleArea = 0;

        Shape[]arr = new Shape[9];
        arr[0] = new Rectangle("Brown",2,2);
        arr[1] = new Rectangle("Black",5,6);
        arr[2] = new Rectangle("Yellow",7,8);
        arr[3] = new Rectangle("Grey",10,4);
        arr[4] = new Rectangle("Purple",3,5);
        arr[5] = new Circle("White",6);
        arr[6] = new Circle("Orange",8);
        arr[7] = new Triangle("Pink",9,10,13);
        arr[8] = new Triangle("Blue",8,6,9);

        Arrays.sort(arr);
        for (Shape shapes: arr) {
            shapes.draw();

            sumArea += shapes.calcArea();

            if (shapes instanceof Rectangle){
                sumRectArea += shapes.calcArea();
            }
            if (shapes instanceof Circle){
                sumCircleArea += shapes.calcArea();
            }
            if (shapes instanceof Triangle){
                sumTriangleArea += shapes.calcArea();
            }

        }
        System.out.println("\n" + "Sorted in lexicographical order by color name\n");
        ShapeColorComparator comparator = new ShapeColorComparator();
        Arrays.sort(arr,comparator);
        for (Shape shapes: arr) {
            shapes.draw();
        }
    }
}
