package chapter10.alone1;

// Calc 인터페이스 상속
public abstract class Calculator implements Calc {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int substract(int a, int b) {
        return a - b;
    }
}
