package Chapter6.workshop01;

public class Sonata extends Car {
    @Override
    protected void start() {
        System.out.println("소나타 시동을 켭니다.");
    }

    @Override
    protected void drive() {
        System.out.println("소나타 달립니다.");
    }

    @Override
    protected void stop() {
        System.out.println("소나타 멈춤니다.");
    }

    @Override
    protected void turnoff() {
        System.out.println("소나타 시동을 끕니다.");
    }
}
