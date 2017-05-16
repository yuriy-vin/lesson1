package OOP.Them2_2.Laba2;

import java.lang.reflect.Array;

/**
 * Created by Yuriy on 02.02.2017.
 */
public class Matrix {

    public static void multipleMatrix(int[][] a, int[][] b) {
        int m = a.length;
        int n1 = a[0].length;
        int n2 = b.length;
        int q = b[0].length;
        if (n1 != n2) {
            System.out.println("Can not mulpiple matrixes. The sizes are not correct!!!");
        } else {
            System.out.println("The multiple of matrixes is");
            int[][] c = new int[m][q];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < q; j++) {
                    c[i][j] = 0;
                    for (int k = 0; k < n1; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void additionMatrix(int[][] a, int[][] b) {
        int m1 = a.length;
        int m2 = b.length;
        int n1 = a[0].length;
        int n2 = b[0].length;
        if ((n1 != n2) || (m1 != m2)) {
            System.out.println("Can not addition matrixes. The sizes are not the same!!!");
        } else {
            System.out.println("The addition of matrixes is");
            int[][] c = new int[m1][n1];
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n1; j++) {
                    c[i][j] = a[i][j] * b[i][j];
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
