/**
 * Created by EXPERT177 on 30.01.2017.
 */
public class Lab1_6_3_1 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        int count = 0;
        int temp = 0;
        for (int i = 0; i < 4; i++) {
            count = i + 1;
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = count;
                count += 4;
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
