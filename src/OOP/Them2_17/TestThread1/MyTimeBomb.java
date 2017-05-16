package OOP.Them2_17.TestThread1;

/**
 * Created by Yuriy on 21.03.2017.
 */
public class MyTimeBomb extends Thread{
    private final int time ;

    public MyTimeBomb(int sec){this.time = sec;}
    @Override
    public void run() {
        for(int i= time; i > 0; i--){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Boom!!!");
    }
}
