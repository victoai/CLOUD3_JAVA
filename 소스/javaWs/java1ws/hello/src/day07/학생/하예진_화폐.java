package day07.학생;

import java.util.Scanner;

public class 하예진_화폐 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] money = new int[] { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		String name;

		while (true) {
			System.out.println("사원명 입력: ");
			name = sc.nextLine();
			if (name.equals("stop")) {
				System.out.println("입력 종료");
				break;
			}
			System.out.println("출장비 입력: ");
			int input = sc.nextInt();
			System.out.println("이름 : " + name + " 님 | 출장비 : " + input + " 원");
			for (int i = 0; i < money.length; i++) {
				System.out.println(money[i] + "원 : " + (input / money[i]));
				input %= money[i];
			}
		}
		sc.close();
	}
}
