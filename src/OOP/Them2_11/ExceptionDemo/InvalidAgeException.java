package OOP.Them2_11.ExceptionDemo;

/**
 * Created by Yuriy on 12.03.2017.
 */
public class InvalidAgeException extends RuntimeException {
    public String getMessage() {
        return "Invalid Age!";
    }
}
