package OOP.Them2_7;

/**
 * Created by Yuriy on 14.02.2017.
 */
public class Car {
    public String name = "CAR am i ?";
    public int madeWhen = 1980;


    static class SportCar extends Car {
        public boolean isSport = true;

        {
            super.name = "Porshe";
            madeWhen = 2017;
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.madeWhen);
        System.out.println(car.name);

        System.out.println("\n-----------------------------------------\n");

        SportCar sportCar = new SportCar();
        System.out.println(sportCar.madeWhen);
        System.out.println(sportCar.name);
        System.out.println("is Sport = " + sportCar.isSport);

        Car cartest = new SportCar();
/*
        System.out.println(cartest.madeWhen);
        System.out.println(cartest.name);
        System.out.println("is Sport = " + cartest.isSport);

        SportCar sportCarTest = (SportCar)new Car();

        SportCar sportCarTest = new Car();*/
    }
}