package Chater7.collection.treeset;

import Chater7.collection.treeset.Member;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet manager = new MemberTreeSet();

        Member memberLee = new Member(300, "Lee");
        Member memberKim = new Member(100, "Kim");
        Member memberPark = new Member(200, "Park");

        manager.addMember(memberLee);
        manager.addMember(memberKim);
        manager.addMember(memberPark);

        manager.showAllMember();

        //java.lang.ClassCastException 발생
        // 해당 클래스에서 Comparable을 상속받아야한다.
    }
}
