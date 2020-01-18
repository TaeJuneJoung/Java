package Chater7.collection.hashmap;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap manager = new MemberHashMap();
        Member lee = new Member(100, "Lee");
        Member kim = new Member(200, "Kim");
        Member park = new Member(300, "Park");
        Member park2 = new Member(300, "Park2");

        manager.addMember(lee);
        manager.addMember(kim);
        manager.addMember(park);
        manager.addMember(park2); //int값이 같기에 마지막에 쓰인 값이 들어간다.

        manager.showAllMember();

        manager.removeMember(200);
        manager.showAllMember();

    }
}
