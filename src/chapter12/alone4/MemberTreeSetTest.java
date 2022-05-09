package chapter12.alone4;

public class MemberTreeSetTest {
    public static void main(String[] args){
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        // 1. given
        Member memberLee = new Member(1001, "이지원");
        Member memberSon = new Member(1002, "손민국");
        Member memberPark = new Member(1003, "박서원");

        // 2. when
        // TreeSet에 회원 추가
        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberSon);
        memberTreeSet.addMember(memberPark);
        // 전체 회원 출력
        memberTreeSet.showAllMember();

        // 중복 회원 추가
        Member memberHong = new Member(1003, "홍길동");
        memberTreeSet.addMember(memberHong);
        // 전체 회원 출력
        memberTreeSet.showAllMember();

        // 회원 삭제
        memberTreeSet.removeMember(1003);
        // 전체 회원 출력
        memberTreeSet.showAllMember();
    }
}
