package com.brainacad.lesson1.Lab1_5;

import java.util.Scanner;

/**
 * Created by Yuriy on 24.01.2017.
 */
public class Lab1_5_2 {
    public static void main(String[] args) {
        System.out.println("Enter number x:");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        /*switch (number) {
            case 1:
                System.out.println("-One");
                break;
            case 2:
                System.out.println("-Two");
                break;
            case 3:
                System.out.println("-Three");
                break;
            case 4:
                System.out.println("-Four");
                break;
            case 5:
                System.out.println("-Five");
                break;
            case 6:
                System.out.println("-Six");
                break;
            case 7:
                System.out.println("-Seven");
                break;
            case 8:
                System.out.println("-Eight");
                break;
            case 9:
                System.out.println("-Nine");
                break;
            default:
                System.out.println("-Other");*/

//        }
            if (number == 1) System.out.println("-One");
        if (number == 2) System.out.println("-Two");
        if (number == 3) System.out.println("-Three");
        if (number == 4) System.out.println("-Four");
        if (number == 5) System.out.println("-Five");
        if (number == 6) System.out.println("-Six");
        if (number == 7) System.out.println("-Seven");
        if (number == 8) System.out.println("-Eight");
        if (number ==9) System.out.println("-Nine");
        if (number > 9 || number < 0){
            System.out.println("-Other");
        }

    }
}
