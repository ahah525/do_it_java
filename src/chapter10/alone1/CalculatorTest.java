package chapter10.alone1;

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

    }
}
