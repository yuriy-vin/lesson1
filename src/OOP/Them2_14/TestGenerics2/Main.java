package OOP.Them2_14.TestGenerics2;

import static OOP.Them2_14.TestGenerics2.MyTestMethod.calcNum;
import static OOP.Them2_14.TestGenerics2.MyTestMethod.calcSum;

/**
 * Created by Yuriy on 22.03.2017.
 */
public class Main {
    public static void main(String[] args) {

        Integer[] intARR = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Double[] doubleARR = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9};

// LABA 2
        int numberInt = calcNum(intARR, 3);
        int numberDouble= calcNum(doubleARR, 6.4);
        System.out.printf("\n%s %3d", "Number of elements that are greater than '3' -> ", numberInt);
        System.out.printf("\n%s %1d", "Number of elements that are greater than '6.4' -> ", numberDouble);

// LABA 3
        Double sumInt = calcSum(intARR, 3);
        Double sumDouble = calcSum(doubleARR, 3);
        System.out.printf("\n\n%s %.0f", "Sum of elements that are greater than '3' -> ", sumInt);
        System.out.printf("\n%s %.1f", "Sum of elements that are greater than '3' -> ", sumDouble);

    }
}
