package chapter13.exercise5;

public class CalcTest {
    public static void main(String[] args) {
        // 두 정 수의 합을 반환하는 람다식 직접 구현
        Calc sum = (a, b) -> a + b;

        System.out.println(sum.add(2, 3));
    }
}
