package OOP.Them2_2.Laba2;

/**
 * Created by Yuriy on 11.02.2017.
 */
public class TestMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = {{1,1,1,3},
                           {2,1,3,1},
                           {2,2,3,4}};
        int[][] matrix2 = {{3,-1,1},
                           {2,1,3},
                           {2,2,3},
                           {3,3,1}};
        Matrix.multipleMatrix(matrix1,matrix2);
        Matrix.additionMatrix(matrix1,matrix2);
    }
}
