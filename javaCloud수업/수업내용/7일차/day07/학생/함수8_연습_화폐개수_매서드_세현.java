package day07.학생;

import java.util.Scanner;

public class 함수8_연습_화폐개수_매서드_세현 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("금액을 입력해주세요");	
		
		int total_money = sc.nextInt();
		int[] money = 화폐계산(total_money);
		
		String [] money_won = new String []
				{"오만", "만", "오천", "천", "오백", "백", "오십" ,"십"};	
		
		System.out.println("입력하신 금액은 " + total_money + "원입니다.");
		for(int i=0; i<money.length; i++) {
			System.out.print(money_won[i] + "원: ");
			System.out.println(money[i] + "개");
		}
	}
	
	
	// 화폐계산 매서드
	public static int[] 화폐계산(int total_money) {
		int [] money = new int [8];
		

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
		if(total_money>=500) {
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
		return money;
	}
		 

}
