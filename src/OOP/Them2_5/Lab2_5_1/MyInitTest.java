package OOP.Them2_5.Lab2_5_1;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Yuriy on 07.02.2017.
 */
public class MyInitTest {
    int i = 6;
    int a = 99;

    {
        i = 3;
        System.out.println("non-static 1" + i);
    }

    {
        a = 45;
        System.out.println("non-static 2" + a);
    }

     static {
        int i2 = 0;
        System.out.println("static block1" + i2);
    }

     static {
        int a2 = 8;
        System.out.println("static block2" + a2);
    }

    public MyInitTest (){
        this(100);
        System.out.println("constructor 1");
    }
    public MyInitTest (int a3){
        this.a = a3;
        System.out.println("constructor 2");
    }

}
