package OOP.Them2_4.Lab2_4_6;

/**
 * Created by Yuriy on 12.02.2017.
 */
public class MyPyramid {
    public static void printPyramid(int h){
        for (int i=1; i <= h; i++){
            for (int j = h; j > i; j--){
                System.out.print(" ");
            }
            for (int j=1; j <=i; j++){
                System.out.print(j);
            }
            for (int j=i-1; j > 0; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int h = 5;
        printPyramid(h);
    }
}
