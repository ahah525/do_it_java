package chapter9.alone2;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();
    public abstract void wiper();
    
    public void startCar() {
        System.out.println("시동을 켭니다");    
    }

    public void turnOff() {
        System.out.println("시동을 끕니다");
    }

    // 템플릿 메서드(로직이 정해짐)
    final public void run() {
        startCar();
        drive();
        wiper();
        stop();
        turnOff();
    }
}
