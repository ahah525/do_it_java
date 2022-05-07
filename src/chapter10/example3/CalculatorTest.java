package chapter10.example3;

public class CalculatorTest {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int n = 5;

        CompleteCalc calc = new CompleteCalc();
        System.out.println(calc.add(a, b));
        System.out.println(calc.substract(a, b));
        System.out.println(calc.times(a, b));
        System.out.println(calc.divide(a, b));
        System.out.println(calc.square(n));
        calc.showInfo();

        // 디폴트 메서드 호출
        calc.description();

        // 정적 메서드 호출
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Calc.total(arr));
    }
}
