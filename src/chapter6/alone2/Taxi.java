package chapter6.alone2;

public class Taxi {
    String companyName; // 택시 회사 이름
    int money;  // 택시 수입

    public Taxi(String companyName) {
        // 지하철 노선 번호 초기화
        this.companyName = companyName;
    }

    // 승객이 택시에 탔을 때 구현 메서드
    public void take(int money)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           {
        this.money += money;    // 택시 수입 증가
    }

    // 택시 정보 출력하는 메서드
    public void showInfo() {
        System.out.println(companyName + " 택시 수입은 " + money + "입니다.");
    }
}
