package Chater5.workshop01;

public class Customer {
    private static int customerID = 10000;
    private String customerName;
    String customerGrade;
    int bonusPoint;
    double bonusRatio;

    public Customer() {
        setCustomerID(getCustomerID() + 10);
        this.customerGrade = "SILVER";
        this.bonusRatio = 0.01;
    }

    public Customer(String customerName) {
        this();
        this.customerName = customerName;
    }

    public String showCustomerInfo() {
        return this.getCustomerName() + "님의 등급은 " + this.customerGrade + "이며, 보너스 포인트는 " + this.bonusPoint + "점 입니다.";
    }

    public int calcPrice(int price) {
        this.bonusPoint += price * bonusRatio;
        return price;
    }

    public static int getCustomerID() {
        return customerID;
    }

    public static void setCustomerID(int customerID) {
        Customer.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
