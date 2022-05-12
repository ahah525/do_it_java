package finalProject.school.report;

import finalProject.grade.BasicEvaluation;
import finalProject.grade.GradeEvaluation;
import finalProject.grade.MajorEvaluation;
import finalProject.school.School;
import finalProject.school.Score;
import finalProject.school.Student;
import finalProject.school.Subject;
import finalProject.utils.Define;

import java.util.ArrayList;

// 과목별 결과 리포트
public class GenerateGradeReport {
    School school = School.getInstance();   // 인스턴스 가져오기
    public static final String TITLE = " 수강생 학점 \t\t\n";
    public static final String HEADER = " 이름  | 학번  |필수과목| 점수 \n";
    public static final String LINE = "--------------------------------\n";

    // 문자열 변경할 때 사용
    private StringBuffer buffer = new StringBuffer();

    public String getReport() {
        ArrayList<Subject> subjectList = school.getSubjectList();
        for (Subject subject : subjectList) {
            makeHeader(subject);
            makeBody(subject);
            makeFooter();
        }
        return buffer.toString();   // StringBuffer를 String으로 변환
    }

    // 과목별 리포드 헤더 만들기
    public void makeHeader(Subject subject) {
        buffer.append(LINE);
        buffer.append("\t" + subject.getSubjectName());
        buffer.append(TITLE);
        buffer.append(HEADER);
        buffer.append(LINE);
    }

    // 과목별 리포트 바디 만들기
    public void makeBody(Subject subject) {
        ArrayList<Student> studentList= subject.getStudentList();

        // 모든 수강 학생의 정보 점수
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            buffer.append(student.getStudentName());
            buffer.append(" | ");
            buffer.append(student.getStudentId());
            buffer.append(" | ");
            buffer.append(student.getMajorSubject().getSubjectName() + "\t");
            buffer.append(" | ");

            getScoreGrade(student, subject.getSubjectId());    // 학생의 해당 과목 학점 계산

            buffer.append("\n");
            buffer.append(LINE);

        }
    }

    // 학생 학점 계산
    public void getScoreGrade(Student student, int subjectId) {
        ArrayList<Score> scoreList = student.getScoreList();
        int majorId = student.getMajorSubject().getSubjectId(); // 필수 과목

        // 학점 평가 클래스
        GradeEvaluation[] gradeEvaluation = {
                new BasicEvaluation(),
                new MajorEvaluation()
        };

        for(int i = 0; i < scoreList.size(); i++) {
            Score score = scoreList.get(i);
            // 학점 산출해야할 과목이면
            if(score.getSubject().getSubjectId() == subjectId){
                String grade;
                // 필수 과목이면 전공 학점 산출 방식으로 계산
                if(subjectId == majorId) {
                    grade = gradeEvaluation[Define.SAB_TYPE].getGrade(score.getPoint());
                } else {
                    grade = gradeEvaluation[Define.AB_TYPE].getGrade(score.getPoint());
                }
                buffer.append(score.getPoint());
                buffer.append(":");
                buffer.append(grade);
                buffer.append(" | ");
                break;
            }
        }
    }

    // 과목별 리포트 푸터 만들기
    public void makeFooter() {
        buffer.append("\n");
    }
}
