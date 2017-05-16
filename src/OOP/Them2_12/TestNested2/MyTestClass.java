package OOP.Them2_12.TestNested2;

/**
 * Created by Yuriy on 12.03.2017.
 */
public class MyTestClass {
    void test()
    {
        System.out.println("Test");
    }

    static class MyStaticNested    {
        void print()
        {
            System.out.println("Nested");
        }
    }

    class MyInner {
        void print()
        {
            System.out.println("Inner");
        }
    }

    void Method () {
        class MyLocal {
            void print()
            {
                System.out.println("Local");
            }
        }
    }
}
