package day06;

import java.util.Scanner;

public class 화폐매수구하기_실습2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		

		int[] qty = new int[8];
		int[] coin = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		int[] total = new int[8];

		while (true) {

			int five_m = 0;
			int one_m = 0;
			int five_k = 0;
			int one_k = 0;
			int five_h = 0;
			int one_h = 0;
			int fifty = 0;
			int ten = 0;

			// 배열 반복문

			System.out.print("이름을 입력해주세요(그만하려면 stop을 입력): ");
			String name = sc.next();
			if (name.equals("stop"))
				break;

			System.out.print("금액을 입력해주세요: ");
			int money = sc.nextInt();

			for (int i = 0; i < 8; i++) {
				while (money >= coin[i]) {
					qty[i]++;
					money = money - coin[i];
				}
			}

			//

			for (int i = 0; i < 8; i++) {
				System.out.print(coin[i] + "원:" + qty[i] + ", ");

			}

			// 누적하기
			for (int i = 0; i < 8; i++) {
				total[i] = total[i] + qty[i];
			}

			System.out.println();

		}

		for (int i = 0; i < 8; i++) {
			System.out.println(total[i]);
		}
		System.out.println("시스템이 종료되었습니다.");
	}

}
