package chpater12.alone3;

public class Member {
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
}
