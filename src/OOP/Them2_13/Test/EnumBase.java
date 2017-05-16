package OOP.Them2_13.Test;

/**
 * Created by Yuriy on 11.04.2017.
 */
interface EnumBase {  }
enum AnEnum implements EnumBase { //IMPLEMENTS_INTERFACE
    ONLY_MEM;
}
class EnumCheck {
    public static void main(String []args) {
        if (AnEnum.ONLY_MEM instanceof AnEnum) {
            System.out.println("yes, instance of AnEnum");
        }
        if (AnEnum.ONLY_MEM instanceof EnumBase) {
            System.out.println("yes, instance of EnumBase");
        }
        if (AnEnum.ONLY_MEM instanceof Enum) {   // THIRD_CHECK
            System.out.println("yes, instance of Enum");
        }
    }
}
