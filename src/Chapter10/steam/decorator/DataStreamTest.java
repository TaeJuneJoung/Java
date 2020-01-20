package Chapter10.steam.decorator;

import java.io.*;

public class DataStreamTest {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("./src/Chapter10/assets/data.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            FileInputStream fis = new FileInputStream("./src/Chapter10/assets/data.txt");
            DataInputStream dis = new DataInputStream(fis)) {

            dos.writeByte(100);
            dos.write(100);
            dos.writeChar('A');
            dos.writeUTF("안녕하세요");

            //썼던 대로 읽어줘야한다. -> 타입이 맞지 않아 깨질 우려가 있다.
            System.out.println(dis.readByte());
            System.out.println(dis.read());
            System.out.println(dis.readChar());
            System.out.println(dis.readUTF());

        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
