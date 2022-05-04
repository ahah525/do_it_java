package chapter9.alone1;

public abstract class Car {

    // 추상 메서드
    public abstract void run();

    public abstract void refuel();

    public void stop() {
        System.out.println("차가 멈춥니다.");
    }


}
