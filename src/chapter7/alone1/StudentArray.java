package chapter7.alone1;

public class StudentArray {
    public static void main(String[] args){
        // Student 인스턴스 주소값을 담을 공간 3개 생성
        Student[] students = new Student[3];
        // Student 인스턴스 생성 후 배열에 저장
        students[0] = new Student(1001, "James");
        students[1] = new Student(1002, "Tomas");
        students[2] = new Student(1003, "Edward");

        // Student 정보 출력
        for(int i = 0; i < 3; i ++) {
            students[i].showStudentInfo();
        }
    }
}
