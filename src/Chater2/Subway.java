package Chater2;

public class Subway {
    private int subwayId;
    private int passengerCount;
    private int money;

    public Subway(int subwayId) {
        this.subwayId = subwayId;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showSubwayInfo() {
        System.out.println(subwayId + "번 지하철의 승객은 " + passengerCount + "명이고 수입은 " + money + "원 입니다.");
    }
}
