package OOP.Them2_7.Lab2_7_1;

/**
 * Created by Yuriy on 17.02.2017.
 */
class EthernetAdapter extends Device{
    int speed;
    String mac;

    public EthernetAdapter() {}

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    @Override
    public String toString() {
        super.setClassName(this.getClass().getSimpleName());
        return super.toString() +
                ", speed = "+ speed +
                ", mac = "+ mac;
    }
}