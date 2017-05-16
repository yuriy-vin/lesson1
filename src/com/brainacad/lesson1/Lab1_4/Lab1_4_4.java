package com.brainacad.lesson1;

/**
 * Created by Yuriy on 23.01.2017.
 */
public class Lab1_4_4 {
    public static void main(String[] args) {
        int i = 1;
        int current = i++;
        System.out.println("i="+i +"; current="+current);
        current = --i;
        System.out.println("i="+i +"; current="+current);
         current = ++i;
        System.out.println("i="+i +"; current="+current);
        current = i--;
        System.out.println("i="+i +"; current="+current);

    }
}
