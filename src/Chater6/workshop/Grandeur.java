package Chater6.workshop;

public class Grandeur extends Car {
    @Override
    protected void start() {
        System.out.println("그렌져 시동을 켭니다.");
    }

    @Override
    protected void drive() {
        System.out.println("그렌져 달립니다.");
    }

    @Override
    protected void stop() {
        System.out.println("그렌져 멈춤니다.");
    }

    @Override
    protected void turnoff() {
        System.out.println("그렌져 시동을 끕니다.");
    }
}
