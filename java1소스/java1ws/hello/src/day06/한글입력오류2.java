package day06;
 

import java.util.Scanner;

public class 한글입력오류2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("숫자를 입력하세요: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                System.out.println("입력된 숫자: " + number);
                break;
            } else {
                System.out.println("숫자를 입력하세요.");
                scanner.next(); // 잘못된 입력 제거
            }
        }

        scanner.close();
    }
}
