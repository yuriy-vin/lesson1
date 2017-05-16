package OOP.Them2_11.ExceptionDemo;

/**
 * Created by Yuriy on 12.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Person one = new Person("Semen","Ivanov",39);
        try{
            one.setAge(130);
            System.out.println(one.firstName + " "+one.lastName + " " +one.age);
        } catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
