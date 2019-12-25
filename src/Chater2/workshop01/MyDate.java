package Chater2.workshop01;

public class MyDate {
    private int year;
    private int month;
    private int day;
    private boolean isValid = true;

    /** Constructor **/
    public MyDate() {}

    public MyDate(int year, int month, int day) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }
    public String isValid() {
        if(isValid) {
            return "유효한 날짜입니다.";
        } else {
            return "유효하지 않은 날짜입니다.";
        }
    }

    /** Setter & Getter **/
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if(day < 0 || day > 31) {
                    this.isValid = false;
                } else {
                    this.day = day;
                }
                break;
            case 4: case 6: case 9: case 11:
                if(day < 0 || day > 30) {
                    this.isValid = false;
                } else {
                    this.day = day;
                }
                break;
            case 2:
                if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) { //윤년인 경우
                    if(day < 0 || day > 29) {
                        this.isValid = false;
                    } else {
                        setDay(day);
                    }
                } else {
                    if(day < 0 || day > 28) {
                        this.isValid = false;
                    } else {
                        setDay(day);
                    }
                }
                break;
        }
    }
}
