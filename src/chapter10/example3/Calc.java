package chapter10.example3;

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

    // 디폴트 메서드
    default void description() {
        System.out.println("정수 계산기를 구합니다");
        myMethod(); // private 메서드 호출
    }
    // 정적 메서드
    static int total(int[] arr) {
        int total = 0;

        for(int i : arr) {
            total += i;
        }
        myStaticMethod();   // private static 메서드 호출
        return total;   // 배열 요소들의 합 반환
    }

    // private 메서드
    private void myMethod() {
        System.out.println("private 메서드입니다.");
    }
    
    // private static 메서드
    private static void myStaticMethod() {
        System.out.println("private static 메서드입니다.");
    }
}
