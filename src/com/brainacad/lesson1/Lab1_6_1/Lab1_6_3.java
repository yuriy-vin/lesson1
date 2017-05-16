package com.brainacad.lesson1.Lab1_6_1;

/**
 * Created by EXPERT177 on 30.01.2017.
 */
public class Lab1_6_3 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        int count = 1;
        int temp = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = count++;
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[j][i] + "  ");
            }
            System.out.println();
        }
    }
}
