package Chapter10.steam.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest2 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("./src/Chapter10/assets/input.txt")) {
            int i;
            byte[] bs = new byte[10];
            while((i = fis.read(bs)) != -1) {
                /*
                for(byte b : bs) {
                    System.out.print((char) b);
                }
                System.out.println();
                // 결과값
                * Test File
                * InputFile
                *
                * 이전의 값이 겹쳐 나옴을 볼 수 있다.
                *
                * */

                for(int k=0; k < i; k++) {
                    System.out.print((char)bs[k]);
                }
                System.out.println();
            }
        } catch(IOException e) {
            System.out.println(e);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
