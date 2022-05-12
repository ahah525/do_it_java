package finalProject.school;

import finalProject.utils.Define;

import java.util.ArrayList;

public class Subject {
    private int subjectId;  // 과목 번호
    private String subjectName;  // 과목 이름
    private int gradeType;  // 학점 산출 방식
    private ArrayList<Student> studentList = new ArrayList<>(); // 수강 학생 리스트

    // 과목 생성자(과목 번호, 이름)
    public Subject(String subjectName, int subjectId) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.gradeType = Define.AB_TYPE;    // 일반 과목 학점 방식으로 디폴트 값
    }

    // 수강 신청 메서드
    public void register(Student student) {
        studentList.add(student); // 수강 학생 리스트에 해당 학생 추가
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getGradeType() {
        return gradeType;
    }

    public void setGradeType(int gradeType) {
        this.gradeType = gradeType;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
}
