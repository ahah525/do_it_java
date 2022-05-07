package chapter10.example3;

// Calculator 클래스 상속
public class CompleteCalc extends Calculator {
    @Override
    public int times(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) {
        if(b != 0) 
            return a / b;
        else 
            return Calc.ERROR;  // 오류 반환
    }

    @Override
    public int square(int n) {
        return n * n;
    }

    public void showInfo() {
        System.out.println("Calc 인터페이스를 구현하였습니다");
    }

    // 디폴트 메서드 재정의
    @Override
    public void description() {
        super.description();
    }
}
