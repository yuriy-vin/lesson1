package OOP.Them2_12.TestNested2;

/**
 * Created by Yuriy on 12.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        MyTestClass testClass = new MyTestClass();
        testClass.test();
        MyTestClass.MyStaticNested nested = new MyTestClass.MyStaticNested();
        nested.print();
        MyTestClass.MyInner inner = testClass.new MyInner();
        inner.print();
        testClass.Method();

    }
}
