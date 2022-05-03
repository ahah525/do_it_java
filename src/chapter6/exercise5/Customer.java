package chapter6.exercise5;

public class Customer {
    String name;    // 이름
    int money;  // 갖고 있는 돈

    public Customer(String name, int money) {
        this.name = name;
        this.money = money;
    }

    // 별다방 커피 구매
    public void buyStarCoffe(StarCoffee starCoffee, int money) {
        String message = starCoffee.brewing(4000);
        if (message != null) {
            this.money -= money;    // 커피 가격만큼 차감
            System.out.println(name + "씨가 " + money + "원 짜리 " + message);
        }
    }
    // 콩다방 커피 구매
    public void buyBeanCoffe(BeanCoffee beanCoffee, int money) {
        String message = beanCoffee.brewing(4500);
        if (message != null) {
            this.money -= money;    // 커피 가격만큼 차감
            System.out.println(name + "씨가 " + money + "원 짜리 " + message);
        }
    }
    
}
