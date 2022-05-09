package chapter12.exercise5;

import java.util.HashSet;

public class StudentTest {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();

        set.add(new Student(100,"홍길동"));
        set.add(new Student(200, "강감찬"));
        set.add(new Student(300, "이순신"));
        set.add(new Student(400, "정약용"));
        // 중복된 학생 추가
        set.add(new Student(100, "송중기"));

        System.out.println(set);

    }
}
