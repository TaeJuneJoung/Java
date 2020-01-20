package Chapter7.collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

/*
* 기존의 String은 compare이 구현되어 있기에 정렬을 바꾸려면 아래와 같이 하면 된다.
* */
class MyCompare implements Comparator<String> {

    @Override
    public int compare(String s, String t1) {
        return s.compareTo(t1) * (-1); //내림차순
    }
}

public class ComparatorTest {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>(new MyCompare());
        treeSet.add("홍길동");
        treeSet.add("강감찬");
        treeSet.add("이순신");

        for(String str : treeSet) {
            System.out.println(str);
        }
        // MyCompare설정으로 설정하였기에 역순으로 출력됨
    }
}
