package OOP.Them2_1.Laba1;

public class Comp {
    public Comp(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    private String name;
    private int serialNumber;
    private float price;
    private int cuantityCPU;
    private int frequency;

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getCuantityCPU() {
        return cuantityCPU;
    }

    public void setCuantityCPU(int cuantityCPU) {
        this.cuantityCPU = cuantityCPU;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    int getSerialNumber() {
        return this.serialNumber;
    }

    void setName(String newNameHere) {
        this.name = newNameHere;
    }

    String getName() {
        return this.name;
    }


    public void view() {
        System.out.println("NAME = " + name
                + "; \nSERIAL NUMBER = " + serialNumber
                + "; \nPRICE = " + price + " usd"
                + "; \nCUANTITY CPU = " + cuantityCPU
                + "; \nFREQUENCY = " + frequency + "\n");
    }
}