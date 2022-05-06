package chapter10.alone1;

public interface Calc {
    // 인터페이스 변수는 자동 상수로 변환
    double PI = 3.14;
    int ERROR = -999999999;
    
    // 인터페이스 메서드는 자동 추상 메서드로 변환
    int add(int a, int b);
    int substract(int a, int b);
    int times(int a, int b);
    int divide(int a, int b);
    int square(int n);
}
