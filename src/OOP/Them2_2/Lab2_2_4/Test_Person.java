package OOP.Them2_2.Lab2_2_4;

/**
 * Created by Yuriy on 02.02.2017.
 */
public class Test_Person {
    public static void main(String[] args) {
        String firstName;
        String lastName;
        int age;
        String gender;
        int phoneNumber;
        Person one = new Person();
        one.setFields("Misha","Ivanov", 18, "male", 751318);
        System.out.println("firstName " + one.firstName
                         + ", lastname " + one.lastName
                         + ", age " + one.age
                         + ", gender " + one.gender
                         + ", phonenumber " + one.phoneNumber);


    }
}
