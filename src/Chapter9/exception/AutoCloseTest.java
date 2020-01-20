package Chapter9.exception;

public class AutoCloseTest {
    public static void main(String[] args) {
        try(AutoCloseObj obj = new AutoCloseObj()) {
            //에러 발생하지 않아도 "Close()가 호출되었습니다."
            throw new Exception(); //강제 에러 발생
        } catch(Exception e) {
            System.out.println(e);
            // 에러가 발생해도 "Close()가 호출되었습니다."가 나옴 -> AutoCloseable
        }
    }
}
