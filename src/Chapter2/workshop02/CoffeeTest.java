package Chapter2.workshop02;

public class CoffeeTest {
    public static void main(String[] args) {
        Person kim = new Person("김씨", 10000);
        Person lee = new Person("이씨", 5000);

        Coffee cf1 = new Coffee("별다방", "아메리카노", Menu.STAR_AMERICANO);
        Coffee cf2 = new Coffee("콩다방", "라떼", Menu.BEAN_LATTE);

        kim.buy(cf1);
        lee.buy(cf2);
    }
}
