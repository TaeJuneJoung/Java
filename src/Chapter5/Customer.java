package Chapter5;

public class Customer {
    private int customerID;
    private String customerName;
    private String customerGrade;
    private int bonusPoint;
    private double bonusRatio;


    public Customer() {
        setCustomerGrade("SILVER");
        setBonusRatio(0.01);
    }

    public Customer(int customerID, String customerName, int bonusPoint) {
        this();
        this.customerID = customerID;
        this.customerName = customerName;
        this.bonusPoint = bonusPoint;
    }

    public Customer(int customerID, String customerName, String customerGrade, int bonusPoint, double bonusRatio) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerGrade = customerGrade;
        this.bonusPoint = bonusPoint;
        this.bonusRatio = bonusRatio;
    }

    public int calcPricer(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo() {
        return getCustomerName() + "님의 등급은 " + getCustomerGrade() + "이며, 적립된 보너스 포인트는 " + getBonusPoint() + "점 입니다.";
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public double getBonusRatio() {
        return bonusRatio;
    }

    public void setBonusRatio(double bonusRatio) {
        this.bonusRatio = bonusRatio;
    }
}
