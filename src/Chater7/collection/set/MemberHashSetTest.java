package Chater7.collection.set;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet manager = new MemberHashSet();

        Member memberLee = new Member(100, "Lee");
        Member memberKim = new Member(200, "Kim");
        Member memberPark = new Member(300, "Park");
        Member memberPark2 = new Member(300, "Park");

        manager.addMember(memberLee);
        manager.addMember(memberKim);
        manager.addMember(memberPark);
        manager.addMember(memberPark2);
        // String과 같은 경우는 hashCode와 equals과 재정의 되어 있기에 중복처리가 된 것이고,
        // 해당 클래스는 재정의를 안해주면 중복처리 없이 들어가게 된다.

        // -> 재정의
        // 들어가지 않게 정의하였기에 들어가지 않게 된다.

        manager.showAllMember();

        System.out.println("===== remoe 전/후 =====");

        manager.removeMember(100);
        manager.showAllMember();
    }
}
