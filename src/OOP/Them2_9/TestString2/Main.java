package OOP.Them2_9.TestString2;

/**
 * Created by Yuriy on 19.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        String mystr1 = "Cartoon";
        String mystr2 = "ToRcat";
        char[] a = mystr1.toCharArray();


        for (int i = 0; i < a.length; i++){
           if(mystr2.toLowerCase().indexOf(a[i]) < 0 & mystr2.toUpperCase().indexOf(a[i]) < 0 ){
                System.out.println(a[i]);
            }
           /* String resultStr = "";
            for (int i1 = 0; i1 <mystr2.length(); i1++) {
                mystr1 = mystr1.toLowerCase().replaceAll(String.valueOf(b[i]).toLowerCase(),"");
            }
            System.out.println(resultStr);*/
        }
    }
}
