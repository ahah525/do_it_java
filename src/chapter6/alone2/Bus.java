package chapter6.alone2;

public class Bus {
    int busNumber;  // 버스 번호
    int passengerCount; // 승객 수
    int money;  // 버스 수입

    public Bus(int busNumber) {
        // 버스 번호 초기화
        this.busNumber = busNumber;
    }

    // 승객이 버스에 탔을 때 구현 메서드
    public void take(int money) {
        this.money += money;    // 버스 수입 증가
        passengerCount++;   // 승객 수 1 증가
    }

    // 버스 정보 출력하는 메서드
    public void showInfo() {
        System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
    }
}
