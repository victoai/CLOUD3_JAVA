package day03;

import java.util.Scanner;

public class 제어문_switch4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("성적을 입력하세요 (0~100): ");
        int score = sc.nextInt();
        
        String grade;
        switch(score / 10) {
            case 10: // 100인 경우 포함
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            default:
                grade = "F";
        }
        
        System.out.println("입력한 성적은 " + score + "점이고, 등급은 " + grade + "입니다.");
        sc.close();
    }
}
