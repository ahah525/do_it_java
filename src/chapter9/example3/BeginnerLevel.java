package chapter9.example3;

public class BeginnerLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("천천히 달랍니다");
    }

    @Override
    public void jump() {
        System.out.println("Jump할 줄 모르지롱");
    }

    @Override
    public void turn() {
        System.out.println("Turn할 줄 모르지롱");
    }
    
    @Override
    public void showLevelMessage() {
        System.out.println("***** 초급자 레벨입니다 *****");
    }
}
