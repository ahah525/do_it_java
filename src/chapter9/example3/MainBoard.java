package chapter9.example3;

public class MainBoard {

    public static void main(String[] args) {
        // Player 생성
        Player player = new Player();   // 처음 생성하면 BeginnerLevel
        player.play(1);

        // AdvancedLevel 로 업그레이드
        AdvancedLevel aLevel = new AdvancedLevel();
        player.upgradeLevel(aLevel);
        player.play(2);

        // SuperLevel 로 업그레이드
        SuperLevel sLevel = new SuperLevel();
        player.upgradeLevel(sLevel);
        player.play(3);
    }
}
