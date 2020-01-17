package Chater6.Interface.deepening;

public class Customer implements Buy, Sell {
    @Override
    public void buy() {
        System.out.println("Customer Buy");
    }

    @Override
    public void sell() {
        System.out.println("Customer Sell");
    }

    // 상속한 인터페이스 2개가 동일한 이름의 함수를 사용하고 있기에
    // 1.하나를 선택하는 방법
    // 2.재정의 하는 방법
    // 에서 2번을 선택하여 구현함
    @Override
    public void order() {
        System.out.println("Customer order");
    }

    public void sayHello() {
        System.out.println("Hello");
    }
}
