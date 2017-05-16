package OOP.Them2_14.Test;

/**
 * Created by Yuriy on 11.04.2017.
 */
public class WildCard {
    interface BI {  }
    interface DI  extends  BI {  }
    interface DDI  extends  DI {  }
    static class C<T> {  }
    static void foo(C<? super DI> arg) {  }
    public static void main(String []args) {
        foo(new C<BI>());                          //ONE
        foo(new C<DI>());                         //TWO
        /*foo(new C<DDI>());                       //THREE*/
        foo(new C());                                   //FOUR
    }
}
