package finalProject.test;

import finalProject.school.School;
import finalProject.school.Score;
import finalProject.school.Student;
import finalProject.school.Subject;
import finalProject.school.report.GenerateGradeReport;
import finalProject.utils.Define;

public class TestMain {
    School school = School.getInstance();
    Subject korean;
    Subject math;
    GenerateGradeReport gradeReport = new GenerateGradeReport();

    public static void main(String[] args) {
        TestMain test = new TestMain();

        test.createSubject();
        test.createStudent();

        // 성적 결과 리포트
        String report = test.gradeReport.getReport();
        System.out.println(report);
    }

    // 과목 생성하기
    public void createSubject() {
        korean = new Subject("국어", Define.KOREAN);
        math = new Subject("수학", Define.MATH);

        // 과목 등록
        school.addSubject(korean);
        school.addSubject(math);
    }

    // 학생 
    public void createStudent() {
        // 테스트할 학생 생성
        Student student1 = new Student(10001, "김민석", korean);
        Student student2 = new Student(10002, "오세훈", math);
        Student student3 = new Student(10003, "변백현", korean);
        Student student4 = new Student(10004, "김종인", korean);
        Student student5 = new Student(10005, "도경수", math);

        // 학생 추가하기
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        school.addStudent(student4);
        school.addStudent(student5);

        // 국어 과목 학생 등록하기
        korean.register(student1);
        korean.register(student2);
        korean.register(student3);
        korean.register(student4);
        korean.register(student5);

        // 수학 과목 학생 등록하기
        math.register(student1);
        math.register(student2);
        math.register(student3);
        math.register(student4);
        math.register(student5);

        // 각 학생의 과목 점수 추가
        addScoreForStudent(student1, korean, 95);
        addScoreForStudent(student1, math, 56);

        addScoreForStudent(student2, korean, 95);
        addScoreForStudent(student2, math, 95);

        addScoreForStudent(student3, korean, 100);
        addScoreForStudent(student3, math, 88);

        addScoreForStudent(student4, korean, 89);
        addScoreForStudent(student4, math, 95);

        addScoreForStudent(student5, korean, 85);
        addScoreForStudent(student5, math, 56);
    }

    // 과목별 점수 추가 메서드
    public void addScoreForStudent(Student student, Subject subject, int point) {
        Score score = new Score(student.getStudentId(), subject, point);
        student.addSubjectScore(score);
    }
}
