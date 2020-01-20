package Chapter9.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("a.txt")) {
            System.out.println("출력");
        } catch(FileNotFoundException e) {
            System.out.println(e);
        } catch(IOException e) {
            System.out.println(e);
        }
        System.out.println("end");
    }
}
