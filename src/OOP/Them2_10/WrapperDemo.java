package OOP.Them2_10;

/**
 * Created by Yuriy on 21.02.2017.
 */
public class WrapperDemo {
    public static void main(String[] args) {
        Integer x1 = 130;
        Integer x2 = new Integer(130);
        Integer x3 = Integer.valueOf(130);
        Integer x4 = Integer.parseInt("130");
        System.out.println(x1 == x2);
        System.out.println(x1.equals(x2));
        System.out.println(x1 == x3);
        System.out.println(x1.equals(x3));
        System.out.println(x1 == x4);
        System.out.println(x1.equals(x4));
        System.out.println(x2 == x3);
        System.out.println(x2.equals(x3));
        System.out.println(x2 == x4);
        System.out.println(x2.equals(x4));
        System.out.println(x3 == x4);
        System.out.println(x3.equals(x4));
    }


}
