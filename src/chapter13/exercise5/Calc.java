package chapter13.exercise5;

// 함수형 인터페이스(메서드 1개만 선언가능) 명시
@FunctionalInterface
public interface Calc {
    public int add(int num1, int num2);
}
