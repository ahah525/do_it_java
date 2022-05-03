package chapter7.alone3;

import java.util.ArrayList;

public class StudentArrayList {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // 3명 추가
        students.add(new Student(1001, "James"));
        students.add(new Student(1002, "Tomas"));
        students.add(new Student(1003, "Edward"));

        // 학생 정보 출력(향상된 for문 사용)
        for(Student student : students) {
            student.showStudentInfo();
        }
        /*
        // 일반 for문 사용
        for(int i = 0; i < students.size(); i++) {
            students.get(i).showStudentInfo();
        }
         */
    }
}
