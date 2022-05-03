package chapter7.example4;

import java.util.ArrayList;

public class Student {
    int studentId;  // 학번
    String name;    // 이름
    ArrayList<Subject> subjectArrayList;    // ArrayList 선언

    // 학번과 이름을 매개변수로 받아 생성
    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        subjectArrayList = new ArrayList<>();   // ArrayList 생성
    }

    // 학생이 수강하는 과목을 subjectArrayList에 하나씩 추가하는 메서드
    public void addSubject(String name, int score) {
        Subject subject = new Subject();    // Subject 생성하기
        subject.setName(name);      // 과목 이름 설정
        subject.setScore(score);    // 과목 점수 설정
        subjectArrayList.add(subject);  // 해당 subject를 ArrayList에 추가
    }

    public void showStudentInfo() {
        int total = 0;

        for(Subject subject : subjectArrayList){
            System.out.println("학생 " + name + "의" + subject.getName() + "과목 성적은" + subject.getScore() + "입니다.");
            total += subject.getScore();
        }
        System.out.println("학생 " + name + "의 총점은" + total + "입니다.");
    }


}
