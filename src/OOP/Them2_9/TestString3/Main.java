package OOP.Them2_9.TestString3;

/**
 * Created by Yuriy on 19.02.2017.
 */
public class Main {
    public static char[] uniqueChar(String str){
        char[] arr = str.toCharArray();
        char[] newArr = new char[100];
        int k = 1;
        newArr[0] = arr[0];

        for(int i = 0; i < arr.length; i++){
            boolean isFound = true;
            for (int j = 0; j < arr.length; j++){
                if (arr[i] == newArr[j]){
                    isFound = false;
                    break;
                }
            }
            if (isFound){
                newArr[k] = arr[i];
                k++;
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        String test = "CratoonTomcat";
        System.out.println(uniqueChar(test));
    }
}
