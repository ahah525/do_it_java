package chapter6.alone2;

public class Student {
    public String studentName;  // 이름
    public int grade;   // 학년
    public int money;   // 갖고 있는 돈

    public Student(String studentName, int money) {
        // 이름, 돈 초기화
        this.studentName = studentName;
        this.money = money;
    }

    // 학생이 버스를 타면 1000원을 지불하는 메서드
    public void takeBus(Bus bus) {
        bus.take(1000);
        money -= 1000;  // 승객 돈 차감
    }

    // 학생이 지하철을 타면 1500원을 지불하는 메서드
    public void takeSubway(Subway subway) {
        subway.take(1500);
        money -= 1500;  // 승객 돈 차감
    }

    // 학생이 택시를 타면 10000원을 지불하는 메서드
    public void takeTaxi(Taxi taxi) {
        taxi.take(10000);
        money -= 10000;  // 승객 돈 차감
    }

    // 학생의 현재 정보를 출력하는 메서드
    public void showInfo() {
        System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
    }
}
