package hello;

import java.util.Scanner;

public class 수맞추기3 {

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int randomSu;
		int input;
		int cnt = 0;
		

		 
		//컴퓨터가 수를 낸다
		randomSu = (int) (Math.random() * 100) + 1; // 0~99 사이의 임의 수 +1
		System.out.println("컴퓨터가 수를 냈습니다 1~100 사이 수");
		System.out.println("수를 맞춰보세요 ^___^");


		
		//반복
		while (true) {
			
			cnt++;			
			
			System.out.println("수입력");
			input = sc.nextInt();
		 	

			if (input > randomSu) {
				System.out.println(" 더 작은 수 입력   down");
				
			} else if( input< randomSu){

				System.out.println(" 더 큰 수  입력  up ");
			}else {				
				break;				
			} 

		}
		
		
		//
		

		System.out.println("수를 맞줬습니다");
		System.out.println(randomSu);
		System.out.println("cnt" + cnt); 
		
		if (cnt <= 6) {
			System.out.println("과자 간식 획득  ^^ 앗싸  : !  . 먼저 성공한 사람이 과자 선택권^^ ");
		} else { 

			System.out.println("성공했지만 아쉬어요 ㅠㅠ 참가상 : 새콤달콤  획득 ^");

		}

	}

}
