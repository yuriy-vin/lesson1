package OOP.Them2_14.Test;

/**
 * Created by Yuriy on 11.04.2017.
 */
class Base<T> {  }

class Derived<T> {  }

class Test {

    public static void main(String []args)  {

         Base<Number> b = new Base<Number>();
         /*Base<Number> b = new Derived<Integer>();*/
        /* Derived<Number> b = new Derived<Integer>();*/
         /*Base<Number> b = new Derived<Number>();*/
         /*Base<Integer> b = new Derived<Integer>();*/
         /*Derived<Integer> b = new Derived<Integer>();*/


        //CREATE_INSTANCE

    }

}
