package com.brainacad.lesson1.Lab1_5;

/**
 * Created by Yuriy on 24.01.2017.
 */
public class Lab1_5_3 {
    public static void main(String[] args) {
        System.out.print("* |");
        for (int i = 1; i < 10; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        for (int i = 2; i < 10; i++) {
            System.out.print(i + " |");
            for (int j = 1; j < 10; j++) {
                System.out.printf("%3d",j * i);
            }
            System.out.println();

        }
    }
}
