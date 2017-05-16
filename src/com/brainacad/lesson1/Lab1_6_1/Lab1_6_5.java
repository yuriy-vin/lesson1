package com.brainacad.lesson1.Lab1_6_1;

import java.util.Scanner;

/**
 * Created by Yuriy on 30.01.2017.
 */
public class Lab1_6_5 {
    public static void main(String[] args) {
        int matrix[][] = new int[4][4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix 4 x 4:");
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Transpose matrix is:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%3d",matrix[j][i]);
            }
            System.out.println();
        }

    }
}
