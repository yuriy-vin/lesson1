package OOP.Them2_7.Lab2_7_1;

/**
 * Created by Yuriy on 13.02.2017.
 */
public class Device {
    private String manufacturer;
    private float price;
    private String serialNumber;
    private String className;

    public void setClassName(String className) {
        this.className = className;
    }

    public Device() {}

    public String getManufacturer(){
        return this.manufacturer;
    }

    public void setManufacturer(String newManufacturer){
        this.manufacturer = newManufacturer;
    }

    public float getPrice() {return price;}

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                ": manufacturer = "+manufacturer +
                ", price = "+price +
                ", serialNumber = "+serialNumber;
    }

    @Override
    public boolean equals(Object inputObject) {
        if (this == inputObject) return true;
        if (!(inputObject instanceof  Device)) return false;

        Device device = (Device)inputObject;

        if(Float.compare(device.price,price)!= 0) return false;
        if (!manufacturer.equals(device.manufacturer)) return false;
        if (!serialNumber.equals(device.serialNumber)) return false;
        return true;

    }

    @Override
    public int hashCode() {
        int result = manufacturer.hashCode();
        result = 31 * result + (price != +0.0f ? Float.floatToIntBits(price) : 0);
        result = 31 * result + serialNumber.hashCode();
        return result;
    }
}

