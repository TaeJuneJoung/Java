package Chapter7.collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("홍길동");
        treeSet.add("강감찬");
        treeSet.add("이순신");

        for(String str : treeSet) {
            System.out.println(str);
            /*
            * 강감찬
            * 이순신
            * 홍길동
            * */
        }
        // 정렬이 되어 있는 이유는 String class의 Comparable 덕분
        // -> 우리가 만든 클래스는 구현이 필요하다는 의미
    }
}
