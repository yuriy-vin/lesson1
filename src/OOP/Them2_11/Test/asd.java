package OOP.Them2_11.Test;

/**
 * Created by Yuriy on 09.03.2017.
 */
public class asd {
    public static void main(String[] args) {


        int a = 10;

        String name = null;

        try {

            a = name.length();

            a++;

        } catch (RuntimeException e) {

            ++a;

        }

        System.out.println(a);
    }
}