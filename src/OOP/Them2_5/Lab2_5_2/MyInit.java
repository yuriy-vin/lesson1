package OOP.Them2_5.Lab2_5_2;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Yuriy on 07.02.2017.
 */
public class MyInit {
     static int[] arr = new int[10];
   {
        for (int i = 0; i < 10; i++){
            arr[i] = (int)(100 * Math.random());
        }
    }
    public void printArray(){
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        MyInit one = new MyInit();
        MyInit two = new MyInit();
        one.printArray();
        two.printArray();

    }
}

