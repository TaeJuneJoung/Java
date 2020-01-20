package Chapter10.steam.inputstream;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemInTest {
    public static void main(String[] args) {
        System.out.println("입력 : ");

        try {
            int i;
            InputStreamReader isr = new InputStreamReader(System.in);
            while((i = isr.read()) != '\n') { //System.in만 쓴다면 한글 성립 불가, 보조스트림을 쓴다면 한글 성립 가능
                //한글로 쓸 경우에는 2byte가 된다.
                //반환형이 int여도 1byte씩 읽어오기 때문에 한글일 경우 같은 값이 성립되지 않는다.
                // -> 멀티바이트를 읽을 수 있게 보조 스트림을 써야한다. (InputStreamReader)
                System.out.println(i);
                System.out.println((char) i);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
