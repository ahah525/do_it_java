package chapter7.exercise3;

public class ArrayTest2 {

    public static void main(String[] args) {
        int[] number = new int[5];  // 길이가 5인 정수형 배열 선언
        int total = 0;

        // 짝수만 저장하기
        for(int i = 0; i < number.length; i++) {
            number[i] = (i + 1) * 2;
        }

        for(int i = 0; i < number.length; i++) {
            total += number[i];
        }
        System.out.println("총합: " + total);
    }
}
