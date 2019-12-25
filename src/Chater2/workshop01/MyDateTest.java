package Chater2.workshop01;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(2000, 2, 30);
        System.out.println(date1.isValid());
        MyDate date2 = new MyDate(2019, 12, 25);
        System.out.println(date2.isValid());
    }
}
