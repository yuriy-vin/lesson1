package OOP.Them2_15.Test;

/**
 * Created by Yuriy on 11.04.2017.
 */
import java.util.HashSet;
class Student {
    public Student(int r) {
        rollNo = r;
    }
    int rollNo;
    public int hashCode() {
        return rollNo;
    }
}
class Test1 {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add( new Student(5) );
        Student s10 = new Student(10);
        students.add(s10);
        System.out.println(students.contains(new Student(10)));
        System.out.println(students.contains(s10));
    }
}
