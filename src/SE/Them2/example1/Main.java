package SE.Them2.example1;

import java.io.*;

/**
 * Created by Yuriy on 25.03.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException{
        Student s = new Student("Sasha","Petrov",22);

        File outputWriteFile = new File("D:\\student.ser");
        outputWriteFile.createNewFile();

        FileOutputStream fos = new FileOutputStream("D:\\student.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        try {
            oos.writeObject(s);
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            oos.close();
        }

        Student s2;
        FileInputStream fis = new FileInputStream("D:\\student.ser");
        ObjectInputStream oin = new ObjectInputStream(fis);
        try {
            s2 = (Student)oin.readObject();
            System.out.println("FirstName: " + s2.getFirstName());
            System.out.println("LastName: " + s2.getLastName());
            System.out.println("Age: " + s2.getAge());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            oin.close();
        }
    }
}
