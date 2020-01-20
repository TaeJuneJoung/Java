package Chapter10.steam.reader;

import java.io.*;

public class FileReaderTest {
    public static void main(String[] args) throws IOException { //자주 접했기에 throws처리하여 학습 속도에 중점을 둠
//        FileInputStream fis = new FileInputStream("./src/Chapter10/assets/reader.txt");
        //ìëíì¸ì ë°ê°ìµëë¤ abc -> 한글이 다 깨져나옴

        //방법1.
//        FileReader fis = new FileReader("./src/Chapter10/assets/reader.txt"); //안녕하세요 반갑습니다 abc
        //이렇게 읽어야 한글이 잘 나온다.

        //방법2.
        FileInputStream fis = new FileInputStream("./src/Chapter10/assets/reader.txt");
        InputStreamReader isr = new InputStreamReader(fis);

        int i;
        while((i = isr.read()) != -1) {
            System.out.print((char) i);
        }

        isr.close(); //보조 스트림을 close하면 본래 스트림도 close됨
    }
}
