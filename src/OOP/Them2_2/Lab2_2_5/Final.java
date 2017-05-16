package OOP.Them2_2.Lab2_2_5;

/**
 * Created by Yuriy on 12.02.2017.
 */
public class Final {
    public static void calcSquare(final int a){
        /*a *= a;*/
        System.out.println(a);
    }

    public static void main(String[] args) {
        int a = 5;
        Final.calcSquare(a);
    }
}
