package Chapter9.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }

    public static void main(String[] args) {
        ThrowsException test = new ThrowsException();

        try {
            test.loadClass("b.txt", "java.lang.string");
        } catch (FileNotFoundException e) {
            System.out.println(e); //파일이 없기에
        } catch (ClassNotFoundException e) {
            System.out.println(e); //string이 소문자 s이므로
        } catch (Exception e) { //이외의 에러가 있을수도 있기에... default Exception
            // 에러도 순차적으로 걸린다. -> Exception은 최상위이기에 맨 마지막에 선언
            System.out.println(e);
        }

        try {
            test.loadClass("b.txt", "java.lang.string");
        } catch (FileNotFoundException | ClassNotFoundException e) { //에러를 같이 처리할 수도 있다.
            System.out.println(e);
        }
    }
}
