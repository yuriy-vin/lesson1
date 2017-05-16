package OOP.Them2_12.MyPhone;

import OOP.Them2_11.ExceptionDemo.Person;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Yuriy on 12.03.2017.
 */
public class MyPhone {
    MyPhoneBook1 contacts = new MyPhoneBook1();
    public MyPhone(){
        MyPhoneBook1.PhoneNumber1 phonebook;
    }
    public void switchOn(){
        System.out.print("Loading PhoneBook records...");

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

    public void call(int value){
        System.out.print("Calling to " + contacts.phoneNumbers[value]);

    }


    public class MyPhoneBook1 {
        MyPhoneBook1.PhoneNumber1[] phoneNumbers = new MyPhoneBook1.PhoneNumber1[10];

        public PhoneNumber1[] getPhoneNumbers() {
            return phoneNumbers;
        }

        int count = 0;
        public void addPhoneNumber(String name, String phone){
            if (phoneNumbers[count]== null) {
                phoneNumbers[count] = new MyPhoneBook1.PhoneNumber1(name, phone);
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
            Arrays.sort(phoneNumbers, new Comparator<MyPhoneBook1.PhoneNumber1>() {
                @Override
                public int compare(MyPhoneBook1.PhoneNumber1 o1,MyPhoneBook1.PhoneNumber1 o2) {
                    if (o1 != null) {
                        return o1.getName().compareTo(o2.getName());
                    } else return 0;
                }
            });
        }

        public void sortByPhoneNumber(){
            Arrays.sort(phoneNumbers, new Comparator<MyPhoneBook1.PhoneNumber1>() {
                @Override
                public int compare(MyPhoneBook1.PhoneNumber1 o1, MyPhoneBook1.PhoneNumber1 o2) {
                    if (o1 != null) {
                        return o1.getPhone().compareTo(o2.getPhone());
                    } else return 0;
                }
            });
        }
         class PhoneNumber1{
            private String name;
            private String phone;
             public PhoneNumber1(){};
            public PhoneNumber1(String name, String phone) {
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

}
