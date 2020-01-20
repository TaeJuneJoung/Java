package Chapter9.exception;

public class AutoCloseObj implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Close()가 호출되었습니다.");
    }
}
