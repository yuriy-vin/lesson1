package OOP.Them2_4.Lab2_4_7;

import java.util.Scanner;

/**
 * Created by Yuriy on 12.02.2017.
 */
public class GravityCalculator {
    final static double acceleration = 9.81;
    public static double calcDist(double time){
        double dist = 0.5 * acceleration * time * time;
        return dist;
    }

    public static void main(String[] args) {
        System.out.println("Enter value of time:");
        Scanner sc = new Scanner(System.in);
        Double time = sc.nextDouble();
        System.out.println("The distance is: " + calcDist(time));
    }
}
