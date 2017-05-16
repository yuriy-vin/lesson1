package com.brainacad.lesson1.Lab1_6_1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Yuriy on 30.01.2017.
 */
public class Lab1_6_7 {
    public static void main(String[] args) {

        int equalValue = 1;
        int size;
        int[][] matrix = {{1,1,1,3,4},{2,1,3,1,2},{2,2,3,4,1},{3,3,1,1,4}};
        for (int i = 0; i < 4; i++){
            size = 0;
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] == equalValue){
                    size++;
                }
            }
            int[] indexesArrr = new int[size];
            int count = 0;
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] == equalValue){
                    indexesArrr[count] = j;
                    count++;
                }
            }
            System.out.println("Line " + (i+1) + ":" + Arrays.toString(indexesArrr));
        }
    }
}
