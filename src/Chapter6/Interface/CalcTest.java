package Chapter6.Interface;

public class CalcTest {
    public static void main(String[] args) {
        CompleteCalc calc = new CompleteCalc();
        int n1 = 10;
        int n2 = 2;

        System.out.println(calc.add(n1, n2));
        System.out.println(calc.substract(n1, n2));
        System.out.println(calc.times(n1, n2));
        System.out.println(calc.divide(n1, n2));
        calc.showInfo(); //Calc calc = new CompleteCalc()로 하였을 때는 쓸 수 없음. 다운캐스팅을 해서 써야함
        //CompleteCalc에만 해당 메서드가 쓰여 있기에 당연한...

        /*
        * Calc calc = new CompleteCalc();
        * 인터페이스를 구현한 클래스는 인터페이스 타입으로 변수를 선언하여 인스턴스를 생성할 수 있다.
        * 인터페이스는 구현 코드가 없기 때문에 타입 상속이라고도 한다.
        * */

        calc.description();

        int[] arr = {1,2,3,4,5};
        int sum = Calc.total(arr);
        System.out.println(sum);
    }
}
