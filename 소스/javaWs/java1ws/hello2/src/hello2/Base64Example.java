package hello2;

import java.util.Base64;
import java.nio.charset.StandardCharsets;

public class Base64Example {
    public static void main(String[] args) {
        // 예제 문자열
        String text = "Hello";

        // 1. 문자열 → 바이트 배열
        byte[] byteData = text.getBytes(StandardCharsets.UTF_8);

        // 2. Base64 인코딩
        String base64Encoded = Base64.getEncoder().encodeToString(byteData);

        // 출력
        System.out.println("원본 문자열: " + text);

        System.out.print("바이트 배열: ");
        for (byte b : byteData) {
            System.out.print(b + " "); // 각 문자의 아스키 값
        }
        System.out.println();

        System.out.println("Base64 인코딩: " + base64Encoded);
    }
}
