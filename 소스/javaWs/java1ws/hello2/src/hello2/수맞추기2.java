package hello2;

import java.util.Scanner;

public class 수맞추기2 {

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int randomSu;
		int input;
		int cnt = 1;
		

		// 사용자입력
		randomSu = (int) (Math.random() * 100) + 1; // 0~99 사이의 임의 수 +1
		System.out.println("컴퓨터가 수를 냈습니다");

		System.out.println("수입력");
		input = sc.nextInt();
		// System.out.println( input);

		
		while (randomSu != input) {
			cnt++;

			if (input > randomSu) {

				System.out.println(" 더 작은 수 입력");
			} else {

				System.out.println(" 더 큰 수  입력");
			}

			System.out.println("수입력");
			input = sc.nextInt();

		}

		System.out.println("수를 맞줬습니다");
		System.out.println(randomSu);
		System.out.println("cnt" + cnt);
		

		if (cnt <= 3) {
			System.out.println("맛있는 점심 획득 ^^ 성공 , 쵝오~~ ");
		} else if (cnt <= 6) {

			System.out.println("과자 간식 획득  ^^ 앗싸  : ! ");
		} else {

			System.out.println("성공했지만 아쉬어요 ㅠㅠ 참가상 : 마이쭈 획득 ^");

		}

	}

}
