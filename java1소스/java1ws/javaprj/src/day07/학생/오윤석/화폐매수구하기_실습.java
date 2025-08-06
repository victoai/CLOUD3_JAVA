package day07.학생.오윤석;

import java.util.Scanner;

public class 화폐매수구하기_실습 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		

		while (true) {
			int five_m = 0;
			int one_m = 0;
			int five_k = 0;
			int one_k = 0;
			int five_h = 0;
			int one_h = 0;
			int fifty = 0;
			int ten = 0;

			System.out.print("이름을 입력해주세요(그만하려면 stop을 입력): ");
			String name = sc.next();
			if (name.equals("stop")) break;
			
			System.out.print("금액을 입력해주세요: ");
			int money = sc.nextInt();
			
			
			while (money >= 50000) {
				five_m++;
				money = money - 50000;
			}

			while (money >= 10000) {
				one_m++;
				money = money - 10000;
			}

			while (money >= 5000) {
				five_k++;
				money = money - 5000;
			}

			while (money >= 1000) {
				one_k++;
				money = money - 1000;
			}

			while (money >= 500) {
				five_h++;
				money = money - 500;
			}

			while (money >= 100) {
				one_h++;
				money = money - 100;
			}

			while (money >= 50) {
				fifty++;
				money = money - 50;
			}

			while (money >= 10) {
				ten++;
				money = money - 10;
			}

			System.out.println("사원명: " + name);
			System.out.println("오만원:" + five_m + ", " + "만원:" + one_m + ", " + "5천원:" + five_k + ", " + "천원:" + one_k
					+ ", " + "오백원:" + five_h + ", " + "백원:" + one_h + ", " + "오십원:" + fifty + ", " + "십원:" + ten);

		}
		System.out.println("시스템이 종료되었습니다.");
	}

}
