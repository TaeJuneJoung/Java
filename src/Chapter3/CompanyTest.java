package Chapter3;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args) {
        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        System.out.println(company1);
        System.out.println(company2);

        /*  내장되어 있는데 싱글톤으로 구현되어 있는 Calendar */
        Calendar calendar = Calendar.getInstance();
    }
}
