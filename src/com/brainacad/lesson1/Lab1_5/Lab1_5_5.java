package com.brainacad.lesson1.Lab1_5;

import java.util.Scanner;

/**
 * Created by Yuriy on 25.01.2017.
 */
public class Lab1_5_5 {
    public static void main(String[] args) {
        System.out.println("Enter upper bound n:");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        double avg = (double)sum / (double)n;
        System.out.println("The Sum is: [" + sum + "]");
        System.out.println("The Avg is: [" + avg + "]");
    }
}
