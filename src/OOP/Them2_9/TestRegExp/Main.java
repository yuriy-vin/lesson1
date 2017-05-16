package OOP.Them2_9.TestRegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Yuriy on 20.02.2017.
 */
public class Main {
    public static boolean checkPersonWithRegExp(String userNameString) {
        String testpat = "[A-Z][a-z]+$";
        Pattern pat = Pattern.compile(testpat);
        Matcher m = pat.matcher(userNameString);
        if (m.matches()) {
            return true;
        } else {
            return false;
        }
    }




    public static void main(String[] args) {
        String[] userNames= {"VOVA","Ivan","R2d2","ZX","Anna","12345","ToAd","TomCat",""};
        for (String name:userNames) {
            System.out.println(name + " is " + checkPersonWithRegExp(name));
        }
    }
}
