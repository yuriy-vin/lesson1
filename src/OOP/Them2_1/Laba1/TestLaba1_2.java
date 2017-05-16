package OOP.Them2_1.Laba1;

/**
 * Created by Yuriy on 31.01.2017.
 */
public class TestLaba1_2 {
    public static void main(String[] args) {
        Computer computer =new Computer("Vasya",256867,10450,1,1);
        int dar = computer.getSerialNumber();
        computer.setName("Moms PC");
        System.out.println(computer.getName());
        System.out.println("serialNumber " + dar);
    }
}
