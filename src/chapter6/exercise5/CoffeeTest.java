package chapter6.exercise5;

public class CoffeeTest {

    public static void main(String[] args) {
        // 고객 2명 생성
        Customer Kim = new Customer("Kim", 10000);
        Customer Lee = new Customer("Lee", 100000);

        StarCoffee starCoffee = new StarCoffee();
        BeanCoffee beanCoffee = new BeanCoffee();

        Kim.buyStarCoffe(starCoffee, 4000); // 김씨 4000원 아메리카노 구매
        Lee.buyBeanCoffe(beanCoffee, 4500); // 이씨 4500원 라테 구매
    }
}
