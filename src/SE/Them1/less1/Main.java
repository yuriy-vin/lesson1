package SE.Them1.less1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by Yuriy on 23.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        InputStream stdin = System.in;
        int val  = 0;
        try {
            val = stdin.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(val);

        OutputStream stdout = System.out;
        try {
            stdout.write(new byte[]{97,98,99});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
