package chapter11.alone1_1;

public class Student {
    int id;         // 학번
    String name;    // 이름

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // toString() 메서드 재정의하기
    @Override
    public String toString() {
        return id + "," + name; // 학번과 이름 반환
    }
}
