package OOP.Them2_4.Lab2_4_1;

/**
 * Created by Yuriy on 04.02.2017.
 */
public class MyMath {
    public static  int findMax(int[]arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }
    public static  int findMin(int[]arr){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }
    final static double Pi = 3.14;
    public static double areaOfCircle(int radius){
        return Pi * radius * radius;
    }
}

