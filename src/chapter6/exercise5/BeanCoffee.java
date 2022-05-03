package chapter6.exercise5;

public class BeanCoffee {
    int money;  // 콩다방 수익

    public String brewing(int money) {
        this.money += money;    // 수익 반영
        if (money == Menu.BEANAMERICANO) {
            return "콩다방 아메리카노를 구입했습니다";
        } else if (money == Menu.BEANLATTE) {
            return "콩다방 라테를 구입했습니다";
        } else {
            return null;
        }
    }
}
