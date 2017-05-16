package OOP.Them2_12.TestNested1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Yuriy on 12.03.2017.
 */
/*public class MyPhone {
    public MyPhone(){
        MyPhoneBook phonebook;
    }
    public void swichOn(){
        System.out.print("Loading PhoneBook records...");
        OOP.Them2_12.TestNested1.MyPhoneBook contacts = new OOP.Them2_12.TestNested1.MyPhoneBook();
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
        System.out.println("OK!");
    }

    MyPhoneBook call(int value){
        PhoneNumber contact = new PhoneNumber()
        contact = phoneNumbers[value];
        System.out.println("Calling to" + contact);
    }
    public class MyPhoneBook {
        private OOP.Them2_12.TestNested1.MyPhoneBook.PhoneNumber[] phoneNumbers = new OOP.Them2_12.TestNested1.MyPhoneBook.PhoneNumber[10];
        int count = 0;
        public void addPhoneNumber(String name, String phone){
            if (phoneNumbers[count]== null) {
                phoneNumbers[count] = new OOP.Them2_12.TestNested1.MyPhoneBook.PhoneNumber(name, phone);
                count++;
            }
        }

        public void printPhoneBook(){
            for(int i = 0; i < 10; i++){
                if(phoneNumbers[i] != null)
                    System.out.println(phoneNumbers[i]);
            }
        }

        public void sortByName(){
            Arrays.sort(phoneNumbers, new Comparator<OOP.Them2_12.TestNested1.MyPhoneBook.PhoneNumber>() {
                @Override
                public int compare(OOP.Them2_12.TestNested1.MyPhoneBook.PhoneNumber o1, OOP.Them2_12.TestNested1.MyPhoneBook.PhoneNumber o2) {
                    if (o1 != null) {
                        return o1.getName().compareTo(o2.getName());
                    } else return 0;
                }
            });
        }

        public void sortByPhoneNumber(){
            Arrays.sort(phoneNumbers, new Comparator<OOP.Them2_12.TestNested1.MyPhoneBook.PhoneNumber>() {
                @Override
                public int compare(OOP.Them2_12.TestNested1.MyPhoneBook.PhoneNumber o1, OOP.Them2_12.TestNested1.MyPhoneBook.PhoneNumber o2) {
                    if (o1 != null) {
                        return o1.getPhone().compareTo(o2.getPhone());
                    } else return 0;
                }
            });
        }
        class PhoneNumber{
            private String name;
            private String phone;

            public PhoneNumber(String name, String phone) {
                this.name = name;
                this.phone = phone;
            }

            public String getName() {return name;}
            public void setName(String name) {this.name = name;}
            public String getPhone() {return phone;}
            public void setPhone(String phone) {this.phone = phone;}

            @Override
            public String toString() {
                return "Name:"+ getName() + ", "+
                        "phone:" + getPhone();
            }



        }
    }

}*/
