package OOP.Them2_12.TestNested1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Yuriy on 12.03.2017.
 */
public class MyPhoneBook {
    private String[] phoneNumbers1 = {"0672349789","0678945693","0508763452","0987190986","0672345829",
            "0672838034","0975089348","0438756900","0986790322","0672459891"};
    private PhoneNumber[] phoneNumbers = new PhoneNumber[10];
    int count = 0;
    public void addPhoneNumber(String name, String phone){
        if (phoneNumbers[count]== null) {
            phoneNumbers[count] = new PhoneNumber(name, phone);
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
        Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                if (o1 != null) {
                    return o1.getName().compareTo(o2.getName());
                } else return 0;
            }
        });
    }

    public void sortByPhoneNumber(){
        Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                if (o1 != null) {
                    return o1.getPhone().compareTo(o2.getPhone());
                } else return 0;
            }
        });
    }
    static class PhoneNumber{
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
