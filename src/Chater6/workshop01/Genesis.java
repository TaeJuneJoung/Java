package Chater6.workshop01;

public class Genesis extends Car {
    @Override
    protected void start() {
        System.out.println("제네시스 시동을 켭니다.");
    }

    @Override
    protected void drive() {
        System.out.println("제네시스 달립니다.");
    }

    @Override
    protected void stop() {
        System.out.println("제네시스 멈춤니다.");
    }

    @Override
    protected void turnoff() {
        System.out.println("제네시스 시동을 끕니다.");
    }
}
