package OOP.Them2_4.Lab2_4_1;

/**
 * Created by Yuriy on 04.02.2017.
 */
public class Calculation {
    public static void main(String[] args) {
        int[] arr1 = {56, 43, 12, 9, -100, 6, 85, 8, 14};
        int max =  MyMath.findMax(arr1);
        System.out.println("max = " + max);
        int min =  MyMath.findMin(arr1);
        System.out.println("min = " + min);

        int radius = 5;
        double area = MyMath.areaOfCircle(radius);
        System.out.println(" radius = "+ radius);
        System.out.println(" area of circle = "+ area);
        int n = 1000;
        double Pi = MyCalc.CalcPi(n);
        System.out.println("Value of Pi approximated to the n=" + n + " " + Pi);
    }
}
