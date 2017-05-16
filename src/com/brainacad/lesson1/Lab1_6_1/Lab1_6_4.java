package com.brainacad.lesson1.Lab1_6_1;

import java.util.Arrays;

/**
 * Created by Yuriy on 30.01.2017.
 */
public class Lab1_6_4 {
    public static void main(String[] args) {
        int[] arr ={43,77,56,2,57,89,4,43,67,10};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int searchVal = 43;
        int retVal = Arrays.binarySearch(arr,searchVal);
        System.out.println("index of element is:" + retVal);
    }
}
