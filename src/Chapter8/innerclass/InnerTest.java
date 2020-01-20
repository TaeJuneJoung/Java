package Chapter8.innerclass;

class OutClass {
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass() {
        inClass = new InClass();
    }

    class InClass { //인스턴스 내부 클래스
        int iNum = 100;
//        static int sInNum = 200; //Inner Class에서 static을 쓰려면 Inner Class가 static이어야한다.

        void inTest() {
            System.out.println(num); //외부 클래스 변수 접근 가능 - 생성 시기
            System.out.println(sNum);
        }
    }

    public void usingInner() {
        inClass.inTest();
    }

    static class InStaticClass {
        int inNum = 100;
        static int sInNum = 200;

        void inTest() {
            System.out.println(inNum);
            System.out.println(sInNum);
            System.out.println(sNum);
        }

        static void sTest() {
//            System.out.println(inNum); //생성 시기
            System.out.println(sInNum);
            System.out.println(sNum);
        }
    }
}

public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        outClass.usingInner();

        // Inner Class 인스턴스 생성법
        // -> 자주 쓰지 않음. 이렇게 생성하는 것보다 따로 만들어서 쓰는게 낫기에
        // innerClass를 private로 쓰면 접근 불가능
        OutClass.InClass myInClass = outClass.new InClass();

        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        sInClass.inTest();

        OutClass.InStaticClass.sTest();
    }
}
