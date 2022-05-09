package chpater12.alone3;

public class MemberArrayListTest {
    public static void main(String[] args){
        MemberArrayList memberArrayList = new MemberArrayList();

        // 1. given
        Member memberLee = new Member(1001, "이지원");
        Member memberSon = new Member(1002, "손민국");
        Member memberPark = new Member(1003, "박서원");
        Member memberHong = new Member(1004, "홍길동");
        
        // 2. when
        // ArrayList에 회원 추가
        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberSon);
        memberArrayList.addMember(memberPark);
        memberArrayList.addMember(memberHong);
        // 전체 회원 출력
        memberArrayList.showAllMember();
        // 홍길동 회원 삭제
        memberArrayList.removeMember(1004);
        // 전체 회원 출력
        memberArrayList.showAllMember();
        // 특정 위치에 홍길동 회원 삽입
        memberArrayList.insertMember(memberHong, 3);
        // 전체 회원 출력
        memberArrayList.showAllMember();
    }
}
