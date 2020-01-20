package Chapter6.Template;

public abstract class Car {
    protected abstract void drive();
    protected abstract void stop();
    protected void startCar() {
        System.out.println("시동을 켭니다");
    }
    protected void turnOff() {
        System.out.println("시동을 끕니다");
    }

    protected void washCar() {}

    /* 템플릿 메서드 */
    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
        washCar();
    }
}
