package Chater7.collection.treeset;

import Chater7.collection.treeset.Member;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
    private TreeSet<Member> treeSet;

    public MemberTreeSet() {
        //implements Comparable<Member>인 경우
//        treeSet = new TreeSet<Member>();
        // implements Comparator<Member>인 경우
        treeSet = new TreeSet<Member>(new Member());
    }

    public void addMember(Member member) {
        treeSet.add(member);
    }

    public boolean removeMember(int memberID) {
        Iterator<Member> ir = treeSet.iterator();
        while(ir.hasNext()) {
            Member member = ir.next();
            if(member.getMemberID() == memberID) {
                treeSet.remove(member);
                return true;
            }
        }
        System.out.println(memberID + "번호가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        for(Member member : treeSet) {
            System.out.println(member);
        }
    }
}
