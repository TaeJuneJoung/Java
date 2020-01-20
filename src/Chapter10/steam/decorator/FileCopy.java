package Chapter10.steam.decorator;

import java.io.*;
import java.net.Socket;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        long milliseconds = 0;

        try(FileInputStream fis = new FileInputStream("./src/Chapter10/assets/a.zip");
            FileOutputStream fos = new FileOutputStream("./src/Chapter10/assets/copy.zip");
            BufferedInputStream bis = new BufferedInputStream(fis); //Buffered를 쓰는게 속도가 더 빠르다
            BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            milliseconds = System.currentTimeMillis();

            int i;
            while((i = fis.read()) != -1) {
                fos.write(i);
            }

            milliseconds = System.currentTimeMillis() - milliseconds;
        } catch(IOException e) {
            System.out.println(e);
        }

        System.out.println("시간 : " + milliseconds);


        Socket socket = new Socket();
        BufferedReader isr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        isr.readLine();

    }
}
