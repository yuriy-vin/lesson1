package OOP.Them2_14.TestGenerics1;

/**
 * Created by Yuriy on 22.03.2017.
 */
public class MyTuples<A,B,C> {
    private A typeA;
    private B typeB;
    private C typeC;

    public MyTuples(A typeA, B typeB, C typeC) {
        this.typeA = typeA;
        this.typeB = typeB;
        this.typeC = typeC;
    }

    public A getTypeA() {
        return typeA;
    }

    public B getTypeB() {
        return typeB;
    }

    public C getTypeC() {
        return typeC;
    }

    @Override
    public String toString() {
        return "\nTuple: \n" +
                "typeA = " + typeA.getClass().getSimpleName() +
                " \nvalue =" + typeA +
                ",\ntypeB = " + typeB.getClass().getSimpleName() +
                "\nvalue = " + typeB +
                ", \ntypeC = " + typeC.getClass().getSimpleName() +
                "\nvalue = " + typeC + "\n";
    }

    public static void main(String[] args) {
        MyTuples one = new MyTuples<>("Строка", 58, 50000L);
        System.out.println(one);
        MyTuples two = new MyTuples<>( 5.5, "Строка1","Строка2");
        System.out.println(two);
    }
}

