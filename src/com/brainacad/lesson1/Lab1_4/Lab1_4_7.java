package com.brainacad.lesson1;

/**
 * Created by Yuriy on 24.01.2017.
 */
public class Lab1_4_7 {
    public static void main(String[] args) {
        int a = 50;
        int b = 4;
        int c = 3;
        int d = 0;
        int e = (b == 0) ? 0 : (a / b);
        int f = (d == 0) ? 0 : (c / d);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("a / b = " + e);
        System.out.println("c / d = " + f);
    }
}
