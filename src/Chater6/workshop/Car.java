package Chater6.workshop;

public abstract class Car {

    protected abstract void start();
    protected abstract void drive();
    protected abstract void stop();
    protected abstract void turnoff();

    protected void washCar() {
        System.out.println("세차를 합니다.");
    }

    final public void run() {
        start();
        drive();
        stop();
        turnoff();
        //washCar();
    }

}
