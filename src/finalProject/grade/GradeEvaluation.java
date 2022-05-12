package finalProject.grade;

// 학점 산출 방식 인터페이스
public interface GradeEvaluation {
    // 산출 방식에 따라 점수를 학점으로 반환하는 메서드
    public String getGrade(int point);
}
