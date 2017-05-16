package OOP.Them2_2.Lab2_2_3;

/**
 * Created by Yuriy on 02.02.2017.
 */
public class Employee {
    public void calcSalary(String name, double...salary){
        int total_Salary = 0;
        for (double money:salary){
            total_Salary += money;
        }
        System.out.println(name + " salary = " + total_Salary );
    }
}
