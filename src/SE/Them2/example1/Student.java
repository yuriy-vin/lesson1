package SE.Them2.example1;

import java.io.Serializable;

/**
 * Created by Yuriy on 25.03.2017.
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String firstName;
    private String lastName;
    private int age;

    public Student(String fn, String ln, int a) {
        this.firstName = fn;
        this.lastName = ln;
        this.age = a;
        System.out.println("Constructor");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}