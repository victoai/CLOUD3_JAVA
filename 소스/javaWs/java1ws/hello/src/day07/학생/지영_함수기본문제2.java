package day07.학생;

import java.util.Scanner;

public class 지영_함수기본문제2 {

	public static void main(String[] args) {
//		함수기본문제
//		0. 두 수를 매개변수로 받아 합을 반환하는 함수 만들기
//		1. subtract 함수만들어 두 수를 매개변수로 받아  큰 수에서 작은수를 뺀 결과를 반환하는 함수를 만들기
//		2. ★을 세개 출력하는 함수를 만들기
//		3. 투자금을 두 배로 만들어 주는 함수 만들기 
//		4. 이번주 예상 로또번호를 반환하는 함수 만들기 
//		5. 어른판단함수만들기 ( 나이를 매개변수로 전달받는다) 
//		6. 응원의 메시지를 반환하는 함수 만들기 
		
		
		
		
							
				Scanner sc = new Scanner(System.in);
				
		//5. 어른판단함수 만들기 (나이를 매개변수로 전달받는다)		
				System.out.print("나이를 입력해 보세요 ");
				int old = sc.nextInt();
				String result = adult(old);
				System.out.println(result);
		
		
	}
	
	
	
		
		//5. 어른판단함수 만들기 (나이를 매개변수로 전달받는다)
		public static String adult( int age) {
			String result ;
			
			if(age > 18) {
				result = "성인입니다.";
			}else if(age < 18){
				result = "아직 성인이 아닙니다.";
			}else {
				result = "주민등록증은 발급 받으셧나요?";
			}
			return result;
			
			
		}
		
		
		
		
		
	

}
