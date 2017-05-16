package OOP.Them2_7.Lab2_7_6.MyShapes;

/**
 * Created by Yuriy on 17.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        double sumArea = 0;
        double sumRectArea = 0;
        double sumTriangleArea = 0;
        double sumCircleArea = 0;

        Shape shape = new Shape("RED");
        System.out.println(shape);
        System.out.println("Shape area is: " + shape.calcArea() + "\n");

        Shape circle = new Circle("BLUE",10);
        System.out.println(circle);
        System.out.println("Shape area is: " + circle.calcArea() + "\n");

        Shape rectangle = new Rectangle("GREEN",5,6);
        System.out.println(rectangle);
        System.out.println("Shape area is: " + rectangle.calcArea() + "\n");

        Shape triangle = new Triangle("Black",4,6,8);
        System.out.println(triangle);
        System.out.println("Shape area is: " + triangle.calcArea() + "\n");

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

        for (int i = 0; i < arr.length; i++) {

            sumArea += arr[i].calcArea();

            if (arr[i] instanceof Rectangle){
                sumRectArea += arr[i].calcArea();
            }
            if (arr[i] instanceof Circle){
                sumCircleArea += arr[i].calcArea();
            }
            if (arr[i] instanceof Triangle){
                sumTriangleArea += arr[i].calcArea();
            }
            System.out.println(arr[i] + ", area is: " + arr[i].calcArea());
        }
        System.out.println();
        System.out.println("Shapes total area is: " + sumArea);
        System.out.println("Rectangles total area is: " + sumRectArea);
        System.out.println("Circles total area is: " + sumCircleArea);
        System.out.println("Triangles total area is: " + sumTriangleArea);

    }
}
