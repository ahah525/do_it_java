package chapter12.alone4;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
    private TreeSet<Member> treeSet;

    public MemberTreeSet() {
        treeSet = new TreeSet<Member>();
    }

    // 회원 추가 메서드
    public void addMember(Member member){
        treeSet.add(member);
    }
    // 회원 삭제 메서드
    public boolean removeMember(int id) {
        Iterator<Member> ir = treeSet.iterator();

        // treeSet에 다음 요소가 있을 때까지 순회
        while(ir.hasNext()) {
            Member member = ir.next();  // 다음 요소 반환
            // 매개변수로 받은 id에 해당하는 회원이 있으면 삭제
            if(member.getId() == id){
                treeSet.remove(member);
                return true;
            }
        }
        System.out.println(id + "가 존재하지 않습니다");
        return false;
    }
    // 전체 회원 출력 메서드
    public void showAllMember() {
        for(Member member : treeSet) {
            System.out.println(member);
        }
        System.out.println();
    }
}
