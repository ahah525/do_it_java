package chapter9.alone2;

public class CarTest {
    public static void main(String[] args) {
        System.out.println("=== 자율 주행하는 자동차 ===");
        Car aiCar = new AICar();
        aiCar.run();

        System.out.println("=== 사람이 운전하는 자동차 ===");
        Car manualCar = new ManualCar();
        manualCar.run();
    }
}
