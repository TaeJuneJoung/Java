package Chapter8.workshop01;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
    public static void main(String[] args) {
        TravelCustomer lee = new TravelCustomer("이순신", 40, 100);
        TravelCustomer kim = new TravelCustomer("김유신", 20, 100);
        TravelCustomer hong = new TravelCustomer("홍길동", 13, 50);

        List<TravelCustomer> tList = new ArrayList<TravelCustomer>();
        tList.add(lee);
        tList.add(kim);
        tList.add(hong);

        tList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));

        int total = tList.stream().mapToInt(c -> c.getPrice()).sum();
        System.out.println(total);

        tList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
    }
}
