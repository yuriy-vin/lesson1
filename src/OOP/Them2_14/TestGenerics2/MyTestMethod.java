package OOP.Them2_14.TestGenerics2;

/**
 * Created by Yuriy on 22.03.2017.
 */
public class MyTestMethod {
    static <T extends Comparable<T>> int calcNum(T[] array, T maxElem) {
        int count = 0;
        for (T elem : array)
            if (elem.compareTo(maxElem)>0) count++;
        return count;
    }

    static <T extends Number> Double calcSum(T[] array, T maxValue) {
        Double sum = 0.0;
        for (T element : array) {
            if (element.doubleValue() > maxValue.doubleValue()) {
                sum += element.doubleValue();
            }
        }
        return sum;
    }
}
