package OOP.Them2_7.Lab2_7_1;

/**
 * Created by Yuriy on 13.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Device[] devices = new Device[3];
        devices[0] = new Device("Samsung", 3000,"11111");
        devices[1] = new Monitor("LG", 4000,"22222", 1280,1024);
        devices[2] = new EthernetAdapter("Asus", 5000,"33333",100,"G20Y30C40");
        for (int i = 0; i < devices.length; i++) {
            System.out.println(devices[i]);
        }
    }
}
