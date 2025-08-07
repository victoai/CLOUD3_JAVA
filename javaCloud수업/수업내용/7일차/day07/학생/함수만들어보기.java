package day07.학생;

import java.util.Scanner;  

public class 함수만들어보기 {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int number = sc.nextInt();
       
        String result = checkEvenOdd(number); //checkEvenOdd메서드호출하여 홀수 짝수값 result변수에 저장
        System.out.println(number + "은 " + result + "입니다.");
        
    }

    public static String checkEvenOdd(int number) {
        if (number % 2 == 0) {  //숫자를 2로 나눈 나머지가 0이면
            return "짝수";  
        } else {
            return "홀수";  
        }
    }
}
