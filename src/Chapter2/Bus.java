package Chapter2;

public class Bus {
    private int busId;
    private int passengerCount;
    private int money;

    public Bus(int busId) {
        this.busId = busId;
    }

    public void take(int money) {
        this.money += money;
        this.passengerCount++;
    }

    public void showBusInfo() {
        System.out.println(busId + "번 버스의 승객은 " + passengerCount + "명이고 수입은 " + money + "원 입니다.");
    }
}
