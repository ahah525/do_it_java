package chapter6.exercise5;

public class StarCoffee {
    int money;  // 별다방 수익

    public String brewing(int money) {
        this.money += money;    // 수익 반영
        if (money == Menu.STARAMERICANO) {
            return "별다방 아메리카노를 구입했습니다";
        } else if (money == Menu.STARLATTE) {
            return "별다방 라테를 구입했습니다";
        } else {
            return null;
        }
    }
}
