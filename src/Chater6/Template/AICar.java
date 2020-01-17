package Chater6.Template;

public class AICar extends Car {
    @Override
    protected void drive() {
        System.out.println("자율 주행합니다.");
        System.out.println("자동차가 스스로 방향을 바꿉니다.");
    }

    @Override
    protected void stop() {
        System.out.println("자율 주행을 멉춥니다.");
    }

    @Override
    protected void washCar() {
        System.out.println("자율주행이 끝난 후, 세차를 진행합니다.");
    }
}
