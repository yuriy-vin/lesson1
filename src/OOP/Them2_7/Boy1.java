package OOP.Them2_7;

/**
 * Created by Yuriy on 18.02.2017.
 */
public class Boy1 {
    private int age = 19;
    private String name = "Michael";
    public static void main(String[] args) {
        Boy1 b = new Boy1();
        b.toString();
    }
    public String toString() {
        return name + " is " + age + " years old";
    }
}

