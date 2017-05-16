package OOP.Them2_9.TestTokennizer;

import java.util.StringTokenizer;

/**
 * Created by Yuriy on 19.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        String str = "This is String, split by StringTokenizer. Created by Student:Name of Student.";
        StringTokenizer s = new StringTokenizer(str," ,.");
        while (s.hasMoreElements()){
            System.out.println(s.nextElement());
        }
    }

}