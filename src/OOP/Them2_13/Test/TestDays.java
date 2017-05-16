package OOP.Them2_13.Test;

/**
 * Created by Yuriy on 11.04.2017.
 */
public class TestDays {

    public enum Days { MON, TUE, WED };    //Line1
    public static void main(String[] args) {
        for (Days d : Days.values() ) ;               //Line2
        Days [] d2 = Days.values();                  //Line3
        System.out.println(d2[2]);
    }
}