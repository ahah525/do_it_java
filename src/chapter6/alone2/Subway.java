package chapter6.alone2;

public class Subway {
    String lineNumber;  // 지하철 번호
    int passengerCount; // 승객 수
    int money;  // 버스 수입

    public Subway(String lineNumber) {
        // 지하철 노선 번호 초기화
        this.lineNumber = lineNumber;
    }

    // 승객이 지하철에 탔을 때 구현 메서드
    public void take(int money) {
        this.money += money;    // 지하철 수입 증가
        passengerCount++;   // 승객 수 1 증가
    }

    // 지하철 정보 출력하는 메서드
    public void showInfo() {
        System.out.println(lineNumber + "의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
    }
}
