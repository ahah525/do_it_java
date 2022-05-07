package chapter10.exercise7;

public class BubbleSort implements Sort{
    @Override
    public void ascedning(int[] arr) {
        System.out.println("BubbleSort ascending");
    }

    @Override
    public void descending(int[] arr) {
        System.out.println("BubbleSort descending");
    }

    @Override
    public void description() {
        Sort.super.description();   // Sort 인터페이스 description 메서드 호출
        System.out.println("BubbleSort입니다");
    }
}
