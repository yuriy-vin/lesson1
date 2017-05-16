package OOP.Them2_11.Test;

/**
 * Created by Yuriy on 09.03.2017.
 */
class MyExam {

    void question() {

        try  {

            question();

        } catch (StackOverflowError e)  {

            System.out.println("caught");

        }

    }

    public static void main(String args[]) {

        new MyExam().question();

    }

}
