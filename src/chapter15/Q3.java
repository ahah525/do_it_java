package chapter15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Q3 {
    public static void main(String[] args) throws FileNotFoundException {
        // FileOutPutStream: 파일에 바이트 단위로 쓰는 출력 스트림
        // OutputStreamWriter: 바이트 스트림을 문자로 변환해주는 보조 스트림
        try (FileOutputStream fos = new FileOutputStream("src\\chapter15\\a.txt");
             OutputStreamWriter writer = new OutputStreamWriter(fos)) {
            writer.write("지금까지 자바 정말 재미있게 공부했어요^^");    // 파일에 문자열 쓰기
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("a.txt 파일에 쓰기 완료");
    }
}
