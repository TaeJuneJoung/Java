package Chapter10.steam.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("./src/Chapter10/assets/input.txt")) {
            int i;
            while( (i = fis.read()) != -1) {
                System.out.println((char) i );
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);;
        }
    }
}
