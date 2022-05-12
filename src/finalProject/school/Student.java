package finalProject.school;


import java.util.ArrayList;

// 학생 클래스
public class Student {
    private int studentId;      // 학번
    private String studentName; // 이름
    private Subject majorSubject;   // 필수 과목

    private ArrayList<Score> scoreList = new ArrayList<>();   // 점수 리스트

    // 생성자(학번, 이름, 필수 과목으로 생성)
    public Student(int studentId, String studentName, Subject majorSubject) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.majorSubject = majorSubject;
    }

    // 성적 추가 메서드
    public void addSubjectScore(Score score) {
        scoreList.add(score);   // 성적 리스트에 해당 성적 추가
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Subject getMajorSubject() {
        return majorSubject;
    }

    public void setMajorSubject(Subject majorSubject) {
        this.majorSubject = majorSubject;
    }

    //
    public ArrayList<Score> getScoreList() {
        return scoreList;
    }

    public void setScoreList(ArrayList<Score> scoreList) {
        this.scoreList = scoreList;
    }
}
