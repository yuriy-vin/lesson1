package OOP.Them2_11.TestException;

/**
 * Created by Yuriy on 02.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        try{
            throw new Exception("Exception message");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally");
        }

        MyException object = new MyException ("This is My Exception");
        try{
            throw object;
        }catch (MyException e){
            object.printMessage();
        }

        MyTest test = null;
        try{
            test.test();
        } catch (MyException e) {
            e.printMessage();
        }finally{
            System.out.println("Finally");
        }
        /*test.test();*/
    }


}
