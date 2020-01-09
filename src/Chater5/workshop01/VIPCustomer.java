package Chater5.workshop01;

public class VIPCustomer extends Customer{
    private int agentID;

    public VIPCustomer(String customerName, int agentID) {
        super(customerName);
        setAgentID(agentID);
        this.bonusRatio = 0.05;
        this.customerGrade = "VIP";
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo() + "담당 상담원 번호는 " + getAgentID() + "입니다.";
    }

    @Override
    public int calcPrice(int price) {
        this.bonusPoint += price * this.bonusRatio;
        return (int)(price * 0.9);
    }

    public int getAgentID() {
        return agentID;
    }

    public void setAgentID(int agentID) {
        this.agentID = agentID;
    }
}
