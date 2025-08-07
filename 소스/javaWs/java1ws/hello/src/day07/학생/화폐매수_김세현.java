package day07.학생;

import java.util.Scanner;

public class 화폐매수_김세현 {

	public static void main(String[] args) {
		// 사원이름, 금액 입력시 이름, 화폐매수 출력하기

		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		
		System.out.println("출장비를 입력해주세요");
		int total_money = sc.nextInt();
		int travel_expenses = total_money;
		
		int [] money = new int [8];
		String [] money_won = new String []
				{"오만", "만", "오천", "천", "오백", "백", "오십" ,"십"};
		
		
		loop:while(true) {
			// 오만원 계산
			if(total_money>=50000) {
				for(int i=1; total_money>=50000; i++) {
					total_money = total_money - 50000;
					money[0] = i;
				}
			}
			// 만원 계산
			if(total_money>=10000) {
				for(int i=1; total_money>=10000; i++) {
					total_money = total_money - 10000;
					money[1] = i;
				}
			}
			// 오천원 계산
			if(total_money>=5000) {
				for(int i=1; total_money>=5000; i++) {
					total_money = total_money - 5000;
					money[2] = i;
				}
			}
			// 천원 계산
			if(total_money>=1000) {
				for(int i=1; total_money>=1000; i++) {
					total_money = total_money - 1000;
					money[3] = i;
				}
			}
			// 오백원 계산
			if(total_money>500) {
				for(int i=1; total_money>=500; i++) {
					total_money = total_money - 500;
					money[4] = i;
				}
			}
			// 백원 계산
			if(total_money>=100) {
				for(int i=1; total_money>=100; i++) {
					total_money = total_money - 100;
					money[5] = i;
				}
			}
			// 오십원 계산
			if(total_money>=50) {
				for(int i=1; total_money>=50; i++) {
					total_money = total_money - 50;
					money[6] = i;
				}
			}
			// 십원 계산
			if(total_money>=10) {
				for(int i=1; total_money>=10; i++) {
					total_money = total_money - 10;
					money[7] = i;
				}
			}
			// 화폐개수 출력
			System.out.println(name + "님의 출장비는 " + travel_expenses + "원입니다.");
			for(int i=0; i<money.length; i++) {
				System.out.print(money_won[i] + "원: ");
				System.out.println(money[i] + "개");
			}
			break loop;
		}
		

	}

}
