package OOP.Them2_15.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Yuriy on 11.04.2017.
 */
public class AccountManager {

    private Map accountTotals = new HashMap();  //Line1
    private int retirementFund;
    public int getBalance(String accountName) {
        Integer total = (Integer) accountTotals.get(accountName);                               //Line2
        if (total == null)                                           //Line3
            total = Integer.valueOf(0);                     //Line4
        return total.intValue();                                //Line5
    }
    public void setBalance(String accountName, int amount) {
        accountTotals.put(accountName, Integer.valueOf(amount));                                          //Line6
    }

}
