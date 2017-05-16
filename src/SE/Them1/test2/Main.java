package SE.Them1.test2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Yuriy on 23.03.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        File inputReadFile = new File("input.txt");
        File outputWriteFile = new File("output.txt");

        FileOutputStream out = new FileOutputStream(inputReadFile);
        FileInputStream in = new FileInputStream(inputReadFile);

        if (inputReadFile.exists()) {
            inputReadFile.delete();
            System.out.println("inputReadFile created = " + inputReadFile.createNewFile());

            if (outputWriteFile.exists()) outputWriteFile.delete();
            System.out.println("outputWrite created = " + outputWriteFile.createNewFile());

            out.write("this is my first file writing".getBytes());

            out = new FileOutputStream(outputWriteFile);


            try {
           /* in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");*/
                int c;
                while ((c = in.read()) != -1) {
                    out.write(c);
                }
            } finally {
                if (in != null) in.close();
                if (out != null) out.close();
            }
        }

    }
}

