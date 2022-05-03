package chapter6.alone5;

public class CarFactoryTest {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();  // 싱글톤 패턴
        Car mySonata = factory.createCar();
        Car yourSonata = factory.createCar();

        System.out.println(mySonata.getCarNum());   // 10001
        System.out.println(yourSonata.getCarNum()); // 10002

    }
}
