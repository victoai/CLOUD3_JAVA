package day03;

import java.util.Scanner;

public class 제어문_switch3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("월을 입력하세요 (1~12): ");
        int month = sc.nextInt();
        
        String season;
        switch(month) {
            // 3, 4, 5 : 봄
            case 3: 
            case 4: 
            case 5:
                season = "봄";
                break;
            // 6, 7, 8 : 여름
            case 6: 
            case 7: 
            case 8:
                season = "여름";
                break;
            // 9, 10, 11 : 가을
            case 9: 
            case 10: 
            case 11:
                season = "가을";
                break;
            // 12, 1, 2 : 겨울
            case 12: 
            case 1: 
            case 2:
                season = "겨울";
                break;
            default:
                season = "잘못된 입력입니다. 1~12 사이의 숫자를 입력하세요.";
        }
        
        System.out.println("입력한 월은 " + season + "입니다.");
        sc.close();
    }
}
