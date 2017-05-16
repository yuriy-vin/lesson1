package OOP.Them2_10.MyShape;

/**
 * Created by Yuriy on 12.03.2017.
 */
public class InvalidShapeStringException extends Exception {
    @Override
    public String getMessage() {
        return "Invalid Shape!";
    }
}
