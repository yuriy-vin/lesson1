package OOP.Them2_4.Lab2_4_4;

/**
 * Created by Yuriy on 07.02.2017.
 */
public class Employee {
    String firstName;
    String lastName;
    String occupation;
    String telephone;
    private static int numberOfEmployees;

    public Employee(String firstName, String lastName, String occupation, String telephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.telephone = telephone;
        numberOfEmployees++;
    }

    public  static int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public static void main(String[] args) {
        Employee one = new Employee("Vasya", "Ivanov", "driver", "502345");
        Employee two = new Employee("Petya", "Petrov", "plumber", "6499311");
        Employee three = new Employee("Vasya", "Ivanov", "driver", "502345");
        Employee four = new Employee("Petya", "Petrov", "plumber", "6499311");
        System.out.println("The number of employees is: " + Employee.getNumberOfEmployees());

    }
}

