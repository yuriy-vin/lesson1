package OOP.Them2_10.MyShape;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Yuriy on 18.02.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("How long array do you want to create?");

        Shape[] shapesArr = new Shape[Integer.parseInt(reader.readLine())];
        try{
            for (int i = 0; i < shapesArr.length; i++) {
                shapesArr[i] = Shape.parseShape(reader.readLine());
            }
            for (Shape shapes: shapesArr) {
                shapes.draw();
            }
        }catch (Exception e) {
            System.out.println(new InvalidShapeStringException().getMessage());
        }
        /*
        Circle Black 7
        Rectangle White 5 8
        Triangle Red 3 4 6
        Romb Purple 10 10

        */
    }

}
