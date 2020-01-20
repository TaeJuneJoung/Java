package Chapter2;

public class Texi {
    private int texiId;
    private int passengerCount;
    private int money;

    public Texi(int texiId) {
        this.texiId = texiId;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showTexiInfo() {
        System.out.println(texiId + "번 택시의 승객은 " + passengerCount + "명이고 수입은 " + money + "원 입니다.");
    }
}
