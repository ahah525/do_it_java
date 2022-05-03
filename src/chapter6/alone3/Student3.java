package chapter6.alone3;

public class Student3 {
    private static int serialNum = 1000; // 인스턴스가 공유하는 시리얼 넘버
    int studentId;  // 학번
    int cardId; // 카드 번호
    String studentName; // 이름
    int grade;  // 학년
    String address; // 주소

    public Student3() {
        // 학생이 생성 될 때마다 자동으로 학번, 카드 번호 부여
        serialNum++;
        studentId = serialNum;
        cardId = studentId + 100;   // 학생 카드 번호는 학번에 100을 더한 값으로
    }

    // serialNum 의 getter
    public static int getSerialNum() {
        return serialNum;
    }

    // serialNum 의 Setter
    public static void setSerialNum(int serialNum) {
        Student3.serialNum = serialNum;
    }

    // studentName 의 getter
    public String getStudentName() {
        return studentName;
    }

    // studentName 의 setter
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
