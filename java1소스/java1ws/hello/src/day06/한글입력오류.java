package day06;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Scanner;

public class 한글입력오류 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean flag = false;

        do {
            System.out.print("숫자를 입력하세요: ");
            try {
                number = scanner.nextInt();
                flag = true;  
            } catch (InputMismatchException e) {
                System.out.println(" 숫자를 입력하세요.");
                scanner.next();  
            }
        } while (!flag);

        System.out.println("입력된 숫자: " + number);
        scanner.close();
    }
}
    

