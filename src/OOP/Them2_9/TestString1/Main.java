package OOP.Them2_9.TestString1;

/**
 * Created by Yuriy on 18.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        String myStr = "abracadabra";
        int index = myStr.indexOf("ra");
        System.out.println("index of 'ra':" + index);
        System.out.println(myStr.substring(index, index + "ra".length()));
        int index1 = myStr.lastIndexOf("ra");
        System.out.println("index of last 'ra':" + index1);
        System.out.println(myStr.substring(index1, index1 + "ra".length()));

        System.out.println(myStr.substring(3, 7));

        System.out.println(reverseString(myStr));

    }
    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static String reverseByArray(String s) {
        char[] a = s.toCharArray();
        char[] b = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            b[(a.length - 1) - i] = a[i];
        }
        return new String(b);
    }
}
