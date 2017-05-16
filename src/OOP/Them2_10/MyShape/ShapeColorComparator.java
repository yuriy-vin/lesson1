package OOP.Them2_10.MyShape;

import java.util.Comparator;

/**
 * Created by Yuriy on 18.02.2017.
 */
public class ShapeColorComparator implements Comparator <Shape> {
    public int compare(Shape o1, Shape o2) {
        return o1.getShapeColor().compareTo(o2.getShapeColor());
    }
}
