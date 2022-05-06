package chapter9.example3;

public class Player {
    // 멤버 변수로 PlayerLevel 가짐
    private PlayerLevel level;
    
    // Player 생성자
    public Player() {
        // 처음 생성되면 BeginnerLevel로 시작
        level = new BeginnerLevel();
        level.showLevelMessage();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void setLevel(PlayerLevel level) {
        this.level = level;
    }

    // 레벨 변경 메서드
    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
        level.showLevelMessage();
    }

    public void play(int count) {
        level.go(count);
    }
}
