package Chapter10.steam.decorator.workshop01;

public abstract class Decorator extends Coffee { //상속하는데만 사용하는 다 구현된 abstract class

    Coffee coffee;

    public Decorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void brewing() {
        coffee.brewing();
    }
}
