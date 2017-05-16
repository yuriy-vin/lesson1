package com.brainacad.lesson1.Lab1_6_1;

import java.sql.SQLOutput;

/**
 * Created by Yuriy on 26.01.2017.
 */
public class Lab1_6_1 {
    public static void main(String[] args) {
        int[]arr1 = new int[100];
        for( int i = 2; i <= 30; i+=2){
            arr1[i] = i;
            System.out.print(arr1[i] + " ");
        }
    }
}
