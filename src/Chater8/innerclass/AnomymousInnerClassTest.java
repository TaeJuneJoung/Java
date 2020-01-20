package Chater8.innerclass;

class OuterA {
    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i) {

        int num = 100;

        /* 익명 내부 클래스 */
        return new Runnable() {
            @Override
            public void run() {
                System.out.println(num);
                System.out.println(i);
                System.out.println(outNum);
                System.out.println(sNum);
            }
        };
    }

    // 이렇게 구현할 수도 있다.
    Runnable runner = new Runnable() {
        @Override
        public void run() {
            System.out.println("익명 Inner Class");
        }
    };
}

public class AnomymousInnerClassTest {
    public static void main(String[] args) {
        OuterA outer = new OuterA();
        Runnable runnable = outer.getRunnable(50);

        runnable.run();

        outer.runner.run();
    }
}
