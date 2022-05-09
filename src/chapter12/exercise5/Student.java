package chapter12.exercise5;

import java.util.Objects;

public class Student {
    private int id;         // 학번
    private String name;    // 이름

    public Student(int id, String name) {
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

    // toString() 재정의
    @Override
    public String toString() {
        return id + ": " + name;
    }
    
    // 논리적으로 객체가 동일함을 구현하기 위해 equals, hashcode 재정의
    @Override
    public boolean equals(Object o) {
        // id가 같으면 같은 객체임
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
