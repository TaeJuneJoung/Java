package Chapter7.collection.treemap;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap manager = new MemberTreeMap();

        Member memberPark = new Member(300, "Park");
        Member memberLee = new Member(100, "Lee");
        Member memberKim = new Member(200, "Kim");
        Member memberPark2 = new Member(400, "Park");

        manager.addMember(memberLee);
        manager.addMember(memberKim);
        manager.addMember(memberPark);
        manager.addMember(memberPark2);

        manager.showAllMember();
        // 정렬이 잘 되는 이유 -> key값이 Integer이기 때문에, Integer 내부에서 정렬에 대해 정의되어 있어서

        System.out.println("===== remoe 전/후 =====");

        manager.removeMember(100);
        manager.showAllMember();
    }
}
