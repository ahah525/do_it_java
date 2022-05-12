package finalProject.school;

import java.util.ArrayList;

// 싱글톤 패턴으로 구현
public class School {
    private static School instance = new School();  // 한번만 생성

    private static String SCHOOL_NAME = "Good School";
    private ArrayList<Student> studentList = new ArrayList<>(); // 등록된 학생
    private ArrayList<Subject> subjectList = new ArrayList<>(); // 과목 리스트

    private School() {
    }

    // School 인스턴스 반환
    public static School getInstance() {
        if (instance == null) {
            instance = new School();
        }
        return instance;
    }

    // 학생 리스트 반환 메서드
    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    // 학생 등록 메서드
    public void addStudent(Student student) {
        studentList.add(student);
    }

    // 과목 추가 메서드
    public void addSubject(Subject subject) {
        subjectList.add(subject);
    }

    // 과목 리스트 반환하는 리스트
    public ArrayList<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(ArrayList<Subject> subjectList) {
        this.subjectList = subjectList;
    }
}
