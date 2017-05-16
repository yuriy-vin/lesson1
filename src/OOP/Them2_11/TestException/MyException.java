package OOP.Them2_11.TestException;

/**
 * Created by Yuriy on 11.03.2017.
 */
public class MyException extends Exception{
    public MyException(String message){super(message);}
    public void printMessage(){
        System.out.println(this.getMessage());
    }

}
