package OOP.Them2_10;

import java.util.LongSummaryStatistics;

/**
 * Created by Yuriy on 21.02.2017.
 */
public class WrapperDemo2 {
    static Long compute(Byte x,Integer y){
        return Long.valueOf(x + y);
    }
    static Long compute1(Character x,Integer y){
        return Long.valueOf(x + y);
    }

    static Long compute2(Character x,Integer y){
        return (Long.parseLong(x.toString()) + (long)y);
    }

    static Long compute3(Character x,Integer y){
        return new Long(x.toString())+y;
    }

    public static void main(String[] args) {
        System.out.println(compute((byte) 5, 300));
        System.out.println(compute1('5', 300));
        System.out.println(compute2('5', 300));
        System.out.println(compute3('5', 300));


    }
}
