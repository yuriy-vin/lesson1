package OOP.Them2_15.TestCollection3;

import java.util.*;

/**
 * Created by Yuriy on 11.03.2017.
 */
public class Main {
    private static <T> void printElements(Collection<T> cloneCopy) {
        System.out.println("printElements method:\n");
        Iterator<T> iterator = cloneCopy.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        List<String> arrList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++){
            arrList.add("num_" + i);
            linkedList.add("num_" + i);
        }
        Iterator<String> iterator = arrList.iterator();
        Iterator<String> iterator1 = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        // second part
        ListIterator<String> stringListIterator = linkedList.listIterator(linkedList.size());
        List<String> cloneCopy = new ArrayList<>(linkedList);
        while (stringListIterator.hasPrevious())
            cloneCopy.add(stringListIterator.previous());

        printElements(cloneCopy);
    }


 }
