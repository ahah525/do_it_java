package chapter12.alone3;

import java.util.ArrayList;

public class MemberArrayList {
    // ArrayList 선언
    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        // Member형 ArrayList 생성
        arrayList = new ArrayList<Member>();
    }
    // 맨 뒤에 회원 추가 메서드
    public void addMember(Member member) {
        arrayList.add(member);
    }
    // 특정 위치에 회원 삽입 메서드
    public void insertMember(Member member, int index) {
        if(index < 0 || index > arrayList.size()) {
            System.out.println("해당 위치에 삽입할 수 없습니다.");
            return;
        }
        arrayList.add(index, member);
    }
    // 회원 삭제 메서드
    public boolean removeMember(int id) {
        // id에 해당하는 Member 삭제
        for(int i = 0; i < arrayList.size(); i++) {
            Member member = arrayList.get(i);   // i번째 Member 가져오기
            if(id == member.getId()) {
                // 해당 id를 가진 회원이 있으면
                arrayList.remove(i);    // i번째 Member 삭제
                return true;
            }
        }
        System.out.println(id + "가 존재하지 않습니다");
        return false;
    }
    // 전체 회원 출력 메서드
    public void showAllMember() {
        for(Member member : arrayList) {
            System.out.println(member);
        }
        System.out.println();
    }
}
