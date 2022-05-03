package chapter7.alone3;

public class Student {

    int studentId;
    String name;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public void showStudentInfo() {
        System.out.println(studentId + ", " +  name);
    }
}
