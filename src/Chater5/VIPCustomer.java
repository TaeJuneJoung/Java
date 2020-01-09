package Chater5;

public class VIPCustomer extends Customer {
    private int agentID;
    private double saleRatio;

    public VIPCustomer() {
        setCustomerGrade("VIP");
        setBonusRatio(1.05);
        setSaleRatio(0.1);
    }

    @Override
    public int calcPricer(int price) {
        setBonusPoint((int)(price * getBonusRatio()));
        return (int)(price - (price * getSaleRatio()));
    }

    public int getAgentID() {
        return agentID;
    }

    public void setAgentID(int agentID) {
        this.agentID = agentID;
    }

    public double getSaleRatio() {
        return saleRatio;
    }

    public void setSaleRatio(double saleRatio) {
        this.saleRatio = saleRatio;
    }
}
