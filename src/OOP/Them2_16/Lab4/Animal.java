package OOP.Them2_16.Lab4;

/**
 * Created by Yuriy on 13.03.2017.
 */
public class Animal {

}
class Dog extends Animal{

}
class Puppy extends Dog{

}
class Main{
  static void foo(Animal a){
      System.out.println("Animal");
  }
  static void foo(Dog d){
      System.out.println("Dog");
  }
  static void foo(Puppy p){
      System.out.println("Puppy");
  }


    public static void main(String[] args) {
        foo(null);
    }
}