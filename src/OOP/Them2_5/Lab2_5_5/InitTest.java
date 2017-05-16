package OOP.Them2_5.Lab2_5_5;

/**
 * Created by Yuriy on 07.02.2017.
 */
public class InitTest {
    private int id ;
    static private int nextid  = (int)(999 * Math.random())+ 1;

    public InitTest(){
        nextid++;
        id = nextid;
    }

    public int getId(){
        return id;
    }
}

