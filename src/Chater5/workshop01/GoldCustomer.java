package Chater5.workshop01;

public class GoldCustomer extends Customer{
    public GoldCustomer(String customerName) {
        super(customerName);
        this.bonusRatio = 0.02;
        this.customerGrade = "GOLD";
    }

    @Override
    public int calcPrice(int price) {
        this.bonusPoint += price * this.bonusRatio;
        return (int)(price * 0.9);
    }
}
