package Chapter10.steam.outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest1 {
    public static void main(String[] args) {

        byte[] bs = new byte[26];
        byte data = 65;
        for(int i=0; i<bs.length; i++) {
            bs[i] = data;
            data++;
        }

        try(FileOutputStream fos = new FileOutputStream("./src/Chapter10/assets/alpha.txt", true);
            FileInputStream fis = new FileInputStream("./src/Chapter10/assets/alpha.txt")) { //true를 두면 뒤에 append됨

            fos.write(bs);
            int ch;
            while((ch = fis.read()) != -1) {
                System.out.print((char)ch);
            }

        } catch (IOException e) {
            System.out.println(e);
        }


    }
}
