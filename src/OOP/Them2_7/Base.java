package OOP.Them2_7;

/**
 * Created by Yuriy on 18.02.2017.
 */
public class Base {
    public  String name = "Base";

    public  String getName() {

        return name;

    }

}

 class Sub extends Base {

    public String name = "Sub";

    public String getName() {

        return name;

    }

    public static void main(String[] args) {

        Sub s = new Sub();

        Base b = s;

        System.out.println(s.name +" "+ b.name);

    }

}

