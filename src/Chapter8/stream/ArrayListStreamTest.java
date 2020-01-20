package Chapter8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<String>();
        sList.add("Tomas");
        sList.add("Edward");
        sList.add("Jack");

        Stream<String> stream = sList.stream();
        stream.forEach(s -> System.out.println(s));

        // 이미 만들어진 Stream을 가져다 쓸 수 없기에 다시 만들어야한다.
        // String은 Comparable이 구현되어있기에 정렬이 바로 이뤄짐
        sList.parallelStream().sorted().forEach(s -> System.out.println(s));

        sList.stream().map(s -> s.length()).forEach(n -> System.out.println(n));
    }
}
