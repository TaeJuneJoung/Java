package Chapter10.steam.others;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    public static void main(String[] args) {
        try(RandomAccessFile rf = new RandomAccessFile("./src/Chapter10/assets/random.txt", "rw")) {
            rf.writeInt(100);
            System.out.println(rf.getFilePointer());
            rf.writeDouble(3.14);
            rf.writeUTF("안녕하세요");

            rf.seek(0); //위치를 처음 위치로
            int i = rf.readInt();
            double d = rf.readDouble();
            String str = rf.readUTF();
            System.out.println(i);
            System.out.println(d);
            System.out.println(str);

        } catch(IOException e) {
            System.out.println(e);
        }

    }
}
