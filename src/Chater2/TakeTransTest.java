package Chater2;

public class TakeTransTest {
    public static void main(String[] args) {
        Student st1 = new Student("James", 5000);
        Student st2 = new Student("Tomas", 10000);
        Student st3 = new Student("Edward", 20000);

        Bus bus100 = new Bus(100);
        Bus bus101 = new Bus(100);

        Subway subway1 = new Subway(1);
        Subway subway2 = new Subway(2);

        Texi texi = new Texi(1);

        st1.takeBus(bus100);
        st2.takeSubway(subway1);
        st3.takeTexi(texi);

        st1.showInfo();
        st2.showInfo();
        st3.showInfo();

        bus100.showBusInfo();
        bus101.showBusInfo();

        subway1.showSubwayInfo();
        subway2.showSubwayInfo();

        texi.showTexiInfo();
    }
}
