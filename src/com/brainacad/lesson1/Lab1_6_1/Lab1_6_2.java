package com.brainacad.lesson1.Lab1_6_1;

/**
 * Created by Yuriy on 26.01.2017.
 */
public class Lab1_6_2 {
    public static void main(String[] args) {
        int [] m = new int [] {10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
            int max = m[0];
            int min = m[0];
            int sum = m[0];
            for (int i = 1; i <= 11; i++) {
                if (m[i] > max) max = m[i];
                if (m[i] < min) min = m[i];
                sum += m[i];
            }
            double avg = (double)sum / 12;
        System.out.println("max = "+ max);
        System.out.println("min = "+ min);
        System.out.println("avg = "+ avg);
    }
}
