package SE.Them7.TestLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by Yuriy on 18.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Integer[] array = new Random()
                .ints(100,1,10_000)
                .boxed().toArray(Integer[]::new);
        Random rand = new Random();
        System.out.println("Before sorting: " + Arrays.toString(array));
        Arrays.sort(array,(a,b)-> b.compareTo(a));
        System.out.println("After sorting:\n" + Arrays.toString(array));

        /*Part_2*/
        List<String> list = new ArrayList<String>();

    }
}
