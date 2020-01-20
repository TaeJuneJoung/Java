package Chapter5;

/*
* | 테스트 시나리오
* 일반 고객 1명과 VIP 고객 1명이 있습니다.
* 일반 고객의 이름은 이순신, 아이디는 10010, 보너스 포인트는 1000점 입니다.
* VIP고객의 이름은 김유신, 아이디는 10020, 보너스 포인트는 10000점 입니다.
*
* 두 고객을 생성하고 이에 대한 고객 정보를 출력해 보세요.
* */
public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010, "이순신", 1000);
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer();
        customerKim.setCustomerID(10020);
        customerKim.setCustomerName("김유신");
        customerKim.setBonusPoint(10000);
        System.out.println(customerKim.showCustomerInfo());

        /** #업캐스팅 - 상위 클래스로의 묵시적 형 변환
         * 상위 클래스형으로 변수를 선언하고 하위 클래스 인스턴스를 생성할 수 있음
         * 하위 클래스는 상위 클래스의 타입을 내포하고 있으므로 상위 클래스로 묵시적 형변환이 가능함
         * 상관관계에서 모든 하위 클래스는 상위 클래스로 묵시적 형 변환이 됨
         * 그 역은 성립하지 않음음
        * **/
        Customer vc  = new VIPCustomer();

        /** #Override **/
        int priceLee = customerLee.calcPricer(10000);
        int priceKim = customerKim.calcPricer(10000);

        System.out.println(customerLee.showCustomerInfo() + " 지불금액은 " + priceLee + "원 입니다.");
        System.out.println(customerKim.showCustomerInfo() + " 지불금액은 " + priceKim + "원 입니다.");
    }
}
