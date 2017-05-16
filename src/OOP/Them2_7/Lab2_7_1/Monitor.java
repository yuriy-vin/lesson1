package OOP.Them2_7.Lab2_7_1;

/**
 * Created by Yuriy on 17.02.2017.
 */
class Monitor extends Device{
    int resolutionX;
    int resolutionY;

    public Monitor() {}

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        super.setClassName(this.getClass().getSimpleName());
        return super.toString() +
                ", resolutionX = "+resolutionX +
                ", resolutionY = "+ resolutionY;
    }
}
