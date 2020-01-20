package Chapter8.lambda;

public class TestStringConcat {
    public static void main(String[] args) {
        /* 이전에 Interface 사용방법 */
        StringConImpl impl = new StringConImpl();
        impl.makeString("hello", "lambda");

        /* 람다식 사용 */
        StringConcat concat = (s, v) -> System.out.println(s + " " + v);
        concat.makeString("hello", "lambda");

        //돌아가는 원리 -> 익명구현객체(익명 내부 클래스)
        StringConcat concat2 = new StringConcat() {
            @Override
            public void makeString(String s, String v) {
                System.out.println(s + " " + v);
            }
        };
        concat2.makeString("hello", "lambda");
    }
}
