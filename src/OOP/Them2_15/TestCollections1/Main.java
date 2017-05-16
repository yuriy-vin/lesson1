package OOP.Them2_15.TestCollections1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Yuriy on 14.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("number_" + i);
        }
        for(String num:list){
            System.out.println(num);
        }
    }
}
