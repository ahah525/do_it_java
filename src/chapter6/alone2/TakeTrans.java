package chapter6.alone2;

public class TakeTrans {

    public static void main(String[] args) {
        // 학생 3명 인스턴스 생성
        Student studentJames = new Student("James", 5000);
        Student studentTomas = new Student("Tomas", 10000);
        Student studentEdward = new Student("Edward", 20000);

        Bus bus100 = new Bus(100);  // 버스 번호가 100인 버스 생성
        studentJames.takeBus(bus100);   // james가 100번 버스를 탐
        studentJames.showInfo();    // james 정보 출력
        bus100.showInfo();  // 100번 버스의 정보 출력

        Subway subwayGreen = new Subway("2호선");  // 노선 번호가 2호선인 지하철 생성
        studentTomas.takeSubway(subwayGreen);   // tomas가 2호선을 탐
        studentTomas.showInfo();    // tomas 정보 출력
        subwayGreen.showInfo();  // 2호선인 지하철의 정보 출력

        Taxi taxiKakao = new Taxi("카카오");  // 택시 회사가 카카오인 지하철 생성
        studentEdward.takeTaxi(taxiKakao);   // Edward가 택시를 탐
        studentEdward.showInfo();    // Edward 정보 출력
        taxiKakao.showInfo();  // 회사가 카카오인 택시의 정보 출력

    }
}
