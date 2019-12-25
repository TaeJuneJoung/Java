package Chater2.workshop02;

public class Person {
    private String name;
    private int money;

    /** Constructor **/
    public Person() {}

    public Person(String name, int money) {
        setName(name);
        setMoney(money);
    }

    /** method **/
    public void buy(Coffee coffee) {
        System.out.println(name + "이 구매한 음료: " + coffee.getMenu() + "나왔습니다.");
    }

    /** Getter & Setter **/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
