package OOP.Them2_14.TestGenerics3;

/**
 * Created by Yuriy on 22.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Integer[] intARR = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] strARR = {"one", "two", "three", "fore", "five", "six", "seven"};

        MyMixer mixerInt = new MyMixer<>(intARR);
        MyMixer mixerString = new MyMixer<>(strARR);

        System.out.println("\nshuffled Ints: ");
        Object[] shuffledInts = mixerInt.shuffle();
        for (Object o : shuffledInts)
            System.out.print(" " + o + " ");

        System.out.println("\n\nshuffled Strings: ");
        Object[] shuffledStrings = mixerString.shuffle();
        for (Object o : shuffledStrings)
            System.out.print(" " + o + " ");

    }
}
