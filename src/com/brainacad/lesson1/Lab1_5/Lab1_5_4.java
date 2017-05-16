package com.brainacad.lesson1.Lab1_5;

/**
 * Created by Yuriy on 24.01.2017.
 */
public class Lab1_5_4 {
    public static void main(String[] args) {
        int counter = 0;
        for(int i = 1; i <= 300; i++ ){
            if (i%3 == 0 || i%4 == 0) {
                System.out.println(i + " ");
                counter++;
                if (counter > 9) {
                    break;
                }
            }

        }
    }

}
