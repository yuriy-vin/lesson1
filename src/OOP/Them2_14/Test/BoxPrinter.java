package OOP.Them2_14.Test;

/**
 * Created by Yuriy on 19.03.2017.
 */
class BoxPrinter<T> {
    private T val;
    public BoxPrinter(T arg) {
        val = arg;
    }
    public T getValue() {
        return val;
    }
}
class BoxPrinterTest {
    public static void main(String []args) {
        BoxPrinter<Integer> value1 = new BoxPrinter<Integer>( new Integer(10) );
        System.out.println(value1.getValue());
        BoxPrinter<String> value2 = new BoxPrinter<String>("Hello world");
        System.out.println(value2.getValue());
    }
}