package chapter9.exercise5;

public abstract class Car {
    public abstract void start();
    public abstract void drive();
    public abstract void stop();
    public abstract void turnoff();

    // 템플릿 메서드
    final public void run() {
        start();
        drive();
        stop();
        turnoff();
    }
}
