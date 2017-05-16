package OOP.Them2_15.TestCollections2;

import java.util.*;

/**
 * Created by Yuriy on 14.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<String> list = new LinkedList<>();
        Set<String> mySet = new HashSet<>();
        while (mySet.size() < 10) {
            mySet.add("number_" + random.nextInt(10));
        }
        list.addAll(mySet);
        for (String num : list) {
            System.out.println(num);
        }
    }
}

