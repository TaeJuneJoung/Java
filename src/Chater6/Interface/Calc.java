package Chater6.Interface;

public interface Calc {
    /*컴파일 과정에서 `public static final`이 붙음*/
    double PI = 3.14;
    int ERROR = -999999999;

    /*컴파일 과정에서 `abstract`가 붙음*/
    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    /* default method - java8이상 */
    default void description() {
        System.out.println("정수 계산기를 구현합니다.");
        myMethod();
    }

    /* static method - java8이상 */
    static int total(int[] arr) {
        int total = 0;
        for(int i : arr) {
            total += i;
        }
        mystaticMethod();
        return total;
    }

    /* private method - java9이상 */
    private void myMethod() { //이전 버전 사용시 컴파일 에러 발생
        System.out.println("private method");
    }

    private static void mystaticMethod() {
        System.out.println("private static method");
    }
}
