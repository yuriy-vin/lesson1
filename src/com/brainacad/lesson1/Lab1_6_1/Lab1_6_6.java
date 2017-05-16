package com.brainacad.lesson1.Lab1_6_1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Yuriy on 30.01.2017.
 */
public class Lab1_6_6 {
    public static void main(String[] args) {
        int[] monthAvgTemperature = {5,-3,4,-2,0,18,16,10,-7,1,6,15};
        int[] result = new int[12];
        int counter = 0;
        /*Scanner sc =new Scanner(System.in);
        for(int i = 0; i <= 11; i++){
            System.out.println("The average temperature value of month " + (i+1) + " is:");
            monthAvgTemperature [i] = sc.nextInt();
        }*/
        System.out.println(Arrays.toString(monthAvgTemperature));
        for (int i = 0; i < 12; i++){
            if (monthAvgTemperature[i] < 0){
                result[counter] = monthAvgTemperature[i];
                counter++;
            }
        }
        for (int i = 0; i < 12; i++){
            if (monthAvgTemperature[i] >= 0){
                result[counter] = monthAvgTemperature[i];
                counter++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
