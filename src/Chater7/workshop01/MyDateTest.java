package Chater7.workshop01;

class MyDate {
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof MyDate) {
            if(this.day == ((MyDate) obj).day && this.month == ((MyDate) obj).month && this.year == ((MyDate) obj).year) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Integer.parseInt("" + this.year + this.month + this.day);
    }
}


public class MyDateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(18, 01, 2020);
        MyDate date2 = new MyDate(18, 01, 2020);

        System.out.println(date1.equals(date2)); //오버라이딩 전: fasle
        //오버라이딩 후: true
    }
}