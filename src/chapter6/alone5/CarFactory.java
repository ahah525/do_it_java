package chapter6.alone5;

public class CarFactory {
    // 2. 클래스 내부에 static으로 유일한 인스턴스 생성하기
    private static CarFactory carFactory = new CarFactory();


    // 1. 생성자를 private로 만들기
    private CarFactory() {
        // 유일한 자동차 공장 인스턴스 생성
    }

    // 3. 외부에서 참조할 수 있는 public 메서드 만들기
    public static CarFactory getInstance() {
        // carFactory가 생성되지 않았다면 생성해주기
        if (carFactory == null) {
            carFactory = new CarFactory();
        }
        return carFactory;  // 유일한 CarFactory(인스턴스)를 반환
    }
    
    // 자동차를 만드는 메서드
    public Car createCar() {
        return new Car();   // 자동차 클래스 생성
    }
}
