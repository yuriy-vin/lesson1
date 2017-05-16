package OOP.Them2_14.TestGenerics3;

/**
 * Created by Yuriy on 22.03.2017.
 */
public class MyMixer<T> {
    T[] arr;

    MyMixer(T[] arr) {
        this.arr = arr;
    }

    T[] shuffle() {
        T value;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                if (i + 1 != arr.length) {
                    value = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = value;
                }
            }
        }
        return arr;
    }
}
