package chapter7.alone2;

public class AlphaArray {

    public static void main(String[] args) {
        // 소문자 알파벳을 저장한 13행 2열 2차원 리스트
        char[][] alphas = new char[13][2];
        char ch = 'a';

        // 13줄로 출력
        for(int i = 0; i < alphas.length; i++) {
            for (int j = 0; j < alphas[i].length; j++) {
                alphas[i][j] = ch;
                System.out.print(alphas[i][j] + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
