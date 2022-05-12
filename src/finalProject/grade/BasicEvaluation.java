package finalProject.grade;

public class BasicEvaluation implements GradeEvaluation{
    // 학점 산출 메서드 재정의
    @Override
    public String getGrade(int point) {
        String grade = "A";   // 학점
        // 일반 학점 산출
        if(point >= 90 && point <= 100){
            grade = "A";
        } else if (point >= 80) {
            grade = "B";
        } else if (point >= 70) {
            grade = "C";
        } else if (point >= 55) {
            grade = "D";
        } else {
            grade = "F";
        }
        return grade;
    }
}
