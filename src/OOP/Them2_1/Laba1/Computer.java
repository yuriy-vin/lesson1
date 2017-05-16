package OOP.Them2_1.Laba1;

/**
 * Created by Yuriy on 31.01.2017.
 */
public class Computer {
    public Computer (String name, int serialNumber, float price, int quantityCPU, int frequency){
        this.name = name;
        this.serialNumber = serialNumber;
        this.price = price;
        this.quantityCPU = quantityCPU;
        this.frequency = frequency;
    }

    private String name;
    private String manufacture;
    private int serialNumber;
    private float price;
    private int quantityCPU;
    private int frequency;


    /*public static void main(String[] args) {
        Computer computerGrendma =new Computer();
        computerGrendma.price = 1000;
        System.out.println(computerGrendma.price);
    }*/

     int getSerialNumber(){
        return this.serialNumber;
    }

    void setName(String newNameHere){
        this.name = newNameHere;
    }

    String getName(){
        return this.name;
    }

    float getPrice(){return this.price;}

    void setPrice(double multiply) {
        this.price *= (double)multiply;
    }

   public void view () {
       System.out.println(this.name + " " + this.serialNumber + " " + this.price + " " + this.quantityCPU + " " + this.frequency + " ");
       /*Computer[] line = new Computer[5];
       line[0] = this.name;
       line[1] = this.serialNumber;
       line[2] = this.price;
       line[3] = this.quantityCPU;
       line[4] = this.frequency;
       for (int i = 0; i < line.length; i++) {
           System.out.printf(line[i]);
       }*/
   }
}
