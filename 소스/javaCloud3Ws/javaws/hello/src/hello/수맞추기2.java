package hello;

import java.util.Scanner;

public class 수맞추기2 {

	
	public static void main(String[] args) {

		
		//스캐너를 사용해서  키보드로 부터 입력한 내용 가져올때 사용
		Scanner sc = new Scanner(System.in);
		
		int randomSu;
		int input;
		int cnt = 1;
		

	 
		randomSu = (int) (Math.random() * 100) + 1; // 0~99 사이의 임의 수 +1
		System.out.println("컴퓨터가 수를 냈습니다 1~100 사이 수");
		System.out.println("수를 맞춰보세요 ^___^");

		
		//사용자 입력
		System.out.println("수입력");
		input = sc.nextInt();
	 

		
		while (randomSu != input) {
			cnt++;

			if (input > randomSu) {

				System.out.println(" 더 작은 수 입력    down ");
			} else  if( input < randomSu){

				System.out.println(" 더 큰 수  입력   up");
			}

			System.out.println("수입력");
			input = sc.nextInt();

		}

		System.out.println("수를 맞줬습니다");
		System.out.println(randomSu);
		System.out.println("cnt" + cnt);
		

		if (cnt <= 3) {
			System.out.println("과자 간식 획득  2개   ^^ 앗싸  : ! ");
		} else if (cnt <= 6) {
			System.out.println("과자 간식 획득  ^^ 앗싸  : ! ");
		} else {
			System.out.println("성공했지만 아쉬어요 ㅠㅠ 참가상 : 마이쭈 획득 ^");

		}

	}

}
