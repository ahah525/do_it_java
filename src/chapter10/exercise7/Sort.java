package chapter10.exercise7;

public interface Sort {
    // 인터페이스 메서드는 자동으로 추상 메서드로
    void ascedning(int[] arr);  // 오름차순 정렬
    void descending(int[] arr); // 내림차순 정렬
    
    // 디폴트 메서드(모든 구현 클래스에서 공통으로 사용)
    default void description(){
        // 알고리즘 설명
        System.out.println("숫자를 정렬하는 알고리즘입니다");
    }     
}
