package OOP.Them2_4.Lab2_4_1;

/**
 * Created by Yuriy on 12.02.2017.
 */
public class MyCalc {
    public static double CalcPi(int n){
        double count = 3;
        double Pi = 4;
        int x = 2;
        for(int i=0; i<n; i++){
            Pi = Pi - (4 / count);
            System.out.println( Pi);
            count += x;
            count *= (-1);
            x *= (-1);
        }
        return Pi;
    }
}
