package OOP.Them2_14.Test;

/**
 * Created by Yuriy on 11.04.2017.
 */
public class GenericCast {
    static <E> E cast(Object item) {                    //Line1
        return (E) item;
    }
    public static void main(String[] args) {
        Object o1 = 10;
        int i = 10;
        Integer anInteger = 10;
        Integer i1 = cast(o1);                              //Line2
        Integer i2 = cast(i);                                 //Line3
        Integer i3 = cast(10);                              //Line4
        Integer i4 = cast(anInteger);                  //Line5
        System.out.print(""+i1+ i2+ i3+ i4);
    }
}
