package day07.학생;

import java.util.Scanner;

public class 화폐매수_용지민 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] cash = { "50000원", "10000원", "5000원", "1000원", "500원", "100원", "50원", "10원" };
		int[] cnt = new int[8];
		
		while(true) {
			System.out.println("사원명");
			String name = sc.nextLine();
			if(name.equals("stop")) {
				for(int i=0; i<cnt.length; i++) {
					System.out.println(cash[i] + ": " + cnt[i]);
				}
				break;
			}
			System.out.println("출장비");
			int money = Integer.parseInt(sc.nextLine());
			
			int[] quantity = new int[8];
			
			quantity[0] = money / 50000;
			quantity[1] = (money % 50000) / 10000;
			quantity[2] = (money % 10000) / 5000;
			quantity[3] = (money % 5000) / 1000;
			quantity[4] = (money % 1000) / 500;
			quantity[5] = (money % 500) / 100;
			quantity[6] = (money % 100) / 50;
			quantity[7] = (money % 50) / 10;
			
			for(int i=0; i<cash.length; i++) {
				cnt[i] += quantity[i];
				System.out.println(cash[i] + ": " + quantity[i]);
			}
		}

	}

}
