package chapter7.exercise2;

public class AlphaArray {

    public static void main(String[] args) {
        // 소문자 알파벳을 저장한 1차원 리스트
        char[] alphas = new char[26];
        char ch = 'a';

        // 소문자 대입
        for(int i = 0; i < alphas.length; i++) {
            alphas[i] = ch;
            ch++;
        }

        // 소문자에서 대문자로 변환하여 출력
        for(int i = 0; i < alphas.length; i++) {
            alphas[i] = (char)(alphas[i] - 32);
            System.out.println(alphas[i]);
            ch++;
        }
    }
}
