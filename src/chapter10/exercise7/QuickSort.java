package chapter10.exercise7;

public class QuickSort implements Sort{
    @Override
    public void ascedning(int[] arr) {
        System.out.println("QuickSort ascending");
    }

    @Override
    public void descending(int[] arr) {
        System.out.println("QuickSort descending");
    }

    @Override
    public void description() {
        Sort.super.description();
        System.out.println("QuickSort입니다");
    }
}
