package chapter9.example3;

public abstract class PlayerLevel {
    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();

    // 템플릿 메서드
    // 한번 run() -> count만큼 jump() -> 한번 turn()
    final public void go(int count) {
        run();
        for(int i = 0; i < count; i++)
            jump();
        turn();
    }
}
