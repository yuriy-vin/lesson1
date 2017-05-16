package OOP.Them2_14.Test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Yuriy on 19.03.2017.
 */
class Pair<T1, T2> {
    T1 object1;
    T2 object2;
    Pair(T1 one, T2 two) {
        object1 = one;
        object2 = two;
    }
    public T1 getFirst() {
        return object1;
    }
    public T2 getSecond() {
        return object2;
    }
}
class PairTest {
    public static void main(String []args) {
        Pair<Integer, String> worldCup = new Pair<Integer, String>(2010, "South Africa");
        System.out.println("World cup " + worldCup.getFirst() +
                " in " + worldCup.getSecond());
    }
}
