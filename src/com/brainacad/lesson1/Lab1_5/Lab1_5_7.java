package com.brainacad.lesson1.Lab1_5;

import java.util.Scanner;

/**
 * Created by Yuriy on 25.01.2017.
 */
public class Lab1_5_7 {
    public static void main(String[] args) {
        System.out.println("Enter n:");
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        if (n <5) System.out.println("WTF BRO???" );
        for (int number = 1; number <= n; number++) {
            int sum_Div = 0;
            for (int divisor = 1; divisor < number; divisor++) {
                if (number % divisor == 0) {
                    sum_Div += divisor;
                }
            }
            if (sum_Div == number) System.out.println( sum_Div);
        }
    }
}
