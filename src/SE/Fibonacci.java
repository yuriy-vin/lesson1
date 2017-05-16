package SE;

import java.util.Scanner;

/**
 * Created by Yuriy on 28.03.2017.
 */
public class Fibonacci {
     static int i = 0;
     public static int fibonacci(int n) {
        System.out.printf("%d call of fibonacсi with argument %d\n", ++i, n);
        if ( n == 0 ) {
            return 0;
        }
        if ( n == 1 || n == -1 ) {
            return 1;
        }
        if ( n < 0 ) {
            return (fibonacci(n+2) - fibonacci(n+1));
        }
        return (fibonacci(n-1) + fibonacci(n-2));
    }

    public static int fibonacci2(int n){

        int a[] = new int[n];
        a[0] = 1;
        a[1] = 1;
        if ( n == 0 ) {return 0;}
        if ( n == 1 || n == -1 ) {return 1;}
        for(int i = 2; i<n; i++){
            a[i] = a[i-1] + a[i -2];
        }
        return a[n-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci2(n));
    }

}
