package com.brainacad.lesson1;

import java.util.Scanner;

/**
 * Created by Yuriy on 21.01.2017.
 */
public class Lab1_2_2 {
    public static void main(String[] args) {
        System.out.println("Enter your name:");

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println("Hello"+ " " + line);
    }
}
