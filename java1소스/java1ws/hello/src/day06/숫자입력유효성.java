package day06;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class 숫자입력유효성 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean validInput = false;
        Pattern pattern = Pattern.compile("^\\d+$"); // 숫자만 포함된 정규식 패턴

        do {
            System.out.print("숫자를 입력하세요: ");
            input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.matches()) {
                validInput = true;
            } else {
                System.out.println("유효하지 않은 입력입니다. 숫자를 입력하세요.");
            }
        } while (!validInput);

        int number = Integer.parseInt(input); // 유효한 숫자로 변환
        System.out.println("입력된 숫자: " + number);
        scanner.close();
    }
}
