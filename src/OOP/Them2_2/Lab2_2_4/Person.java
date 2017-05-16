package OOP.Them2_2.Lab2_2_4;

/**
 * Created by Yuriy on 02.02.2017.
 */


public class Person {
    String firstName;
    String lastName;
    int age;
    String gender;
    int phoneNumber;

    public void setFields(String firstName) {
        this.firstName = firstName;
    }

    public void setFields(String firstName,String lastName) {
        setFields(firstName);
        this.lastName = lastName;
    }

    public void setFields(String firstName,String lastName,int age) {
        setFields(firstName,lastName);
        this.age = age;
    }

    public void setFields(String firstName,String lastName,int age,String gender) {
        setFields(firstName,lastName,age);
        this.gender = gender;
    }

    public void setFields(String firstName,String lastName,int age,String gender,int phoneNumber) {
        setFields(firstName,lastName,age,gender);
        this.phoneNumber = phoneNumber;

    }
}
