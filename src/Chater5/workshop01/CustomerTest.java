package Chater5.workshop01;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<Customer>();

        Customer customerLee = new Customer("이순신");
        Customer customerSin = new Customer("신사임당");
        Customer customerHong = new GoldCustomer("홍길동");
        Customer customerYul = new GoldCustomer("율곡");
        Customer customerKim = new VIPCustomer("김유신", 12345);

        customerList.add(customerLee);
        customerList.add(customerSin);
        customerList.add(customerHong);
        customerList.add(customerYul);
        customerList.add(customerKim);

        System.out.println("======== 고객 정보 출력 ========");

        for(Customer customer : customerList) {
            System.out.println(customer.showCustomerInfo());
        }

        System.out.println("===== 할인률과 보너스 포인트 계산 =====");

        int price = 10000;
        for(Customer customer : customerList) {
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() + "님이 " + cost + "원을 지불하셨습니다.");
            System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는 " + customer.bonusPoint + "점 입니다.");
        }

    }
}
