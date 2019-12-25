package Chater2;

public class Student {
    String studentName;
    int grade;
    int money;

    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        int money = 1350;
        bus.take(money);
        this.money -= money;
    }

    public void takeSubway(Subway subway) {
        int money = 1650;
        subway.take(money);
        this.money -= money;
    }

    public void takeTexi(Texi texi) {
        int money = 10000;
        texi.take(money);
        this.money -= money;
    }

    public void showInfo() {
        System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
    }
}
