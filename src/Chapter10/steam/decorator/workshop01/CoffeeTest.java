package Chapter10.steam.decorator.workshop01;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee americano = new KenyaAmericano();
        americano.brewing();

        Coffee kenyaLatte = new Latte(new KenyaAmericano());
        kenyaLatte.brewing();

        Coffee kenyaMocha = new Mocha(new KenyaAmericano());
        kenyaMocha.brewing();

        Coffee etiopiaMocha = new Mocha(new EtiopiaAmericano());
        etiopiaMocha.brewing();
    }
}
