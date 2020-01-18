package Chater8.innerclass;

class Outer {
    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i) { //final int i

        int num = 100; // final int num = 100; 상수 (final 생략되어있음)

        // 지역 내부 클래스
        class MyRunnable implements Runnable { // Thread할 때 다시 다룰 부분
            @Override
            public void run() {
//                num += 10;
//                i = 200;
                // 위에 num과 i가 안되는 이유
                // -> num과 i는 지역변수이다.
                // Runnable이 반환되고 나면 run은 계속 불릴 수 있기에
                // local변수가 유효하지 못하다. 그래서 final이 생략되어 있다고 생각하면 된다.

                System.out.println(num);
                System.out.println(i);
                System.out.println(outNum);
                System.out.println(sNum);
            }
        }
        return new MyRunnable();
    }
}

public class LocalInnerClassTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Runnable runnable = outer.getRunnable(50);

        runnable.run();
    }
}
