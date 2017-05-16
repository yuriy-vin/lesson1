package com.brainacad.lesson1.Lab1_5;

import java.util.Scanner;

/**
 * Created by Yuriy on 25.01.2017.
 */
public class Lab1_5_6 {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        while(number > 0){
            sum = (number % 10) * (number % 10) + sum;
            number /= 10;
        }
        System.out.println("The_Sum_of_Squares_of_Digits_of_Number is: " + sum);
    }
}
