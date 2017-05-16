package OOP.Them2_12.TestNested1;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;

/**
 * Created by Yuriy on 12.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        // Laba 1/////////////////////////
        System.out.println("");
        MyPhoneBook contacts = new MyPhoneBook();
        contacts.addPhoneNumber("Vasya", "0986754300");
        contacts.addPhoneNumber("Petya", "0674569034");
        contacts.addPhoneNumber("Vanya", "0437890032");
        contacts.addPhoneNumber("Kolya", "0508970026");
        contacts.addPhoneNumber("Galya", "0985679032");
        contacts.addPhoneNumber("Sveta", "0674568921");
        contacts.addPhoneNumber("Vadim", "0670009890");
        contacts.addPhoneNumber("Natasha","0957865433");
        contacts.addPhoneNumber("Artur", "05086000026");
        contacts.addPhoneNumber("Semen", "0985679078");
        contacts.printPhoneBook();

        // Laba 2 , sorted by name and phone/////////////////////////
        System.out.println();
        System.out.println("///////Laba 2 ,sorted by name /////////\n");
        contacts.sortByName();
        contacts.printPhoneBook();
        System.out.println();
        System.out.println("///////Laba 2 ,sorted by phone/////////\n");
        contacts.sortByPhoneNumber();
        contacts.printPhoneBook();
    }
}
