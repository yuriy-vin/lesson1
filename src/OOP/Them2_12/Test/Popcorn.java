package OOP.Them2_12.Test;

/**
 * Created by Yuriy on 14.03.2017.
 */
public class Popcorn {
    public void pop() {
        System.out.println("popcorn");
    }
}
 class Food {
    Popcorn p = new Popcorn() {
        public void pop() {
            System.out.println("anonymous popcorn");
        }
    };
    public static void main(String[]args){
        Food food = new Food();
        food.p.pop();
    }
}
