package chapter12.alone4;

public class Member implements Comparable<Member>{
    private int id;   // 회원 아이디
    private String name;    // 회원 이름

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // toString 재정의
    @Override
    public String toString() {
        return name + " 회원님의 아이디는 " + id + "입니다";
    }

    // equals(), hashCode() 재정의
    // 같은 id인 회원은 논리적으로 같은 객체로 판단
    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if( obj instanceof Member){
            Member member = (Member)obj;
            if( this.id == member.id )
                return true;
            else
                return false;
        }
        return false;
    }

    // compareTo() 재정의
    @Override
    public int compareTo(Member member) {
        // 회원 이름 기준 오름차순 정렬
        return this.name.compareTo(member.name);
        //return this.id - member.id;
    }
}
