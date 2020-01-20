package Chapter4.arrayList;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("AAA");
        list.add("BBB");
        list.add("CCC");

        for(int i=0; i<list.size(); i++) {
            String str = (String)list.get(i);
            System.out.println(str);
        }

        for(Object s : list) {
            System.out.println(s);
        }
    }
}
