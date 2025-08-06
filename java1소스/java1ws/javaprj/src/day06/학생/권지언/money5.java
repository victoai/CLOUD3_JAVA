package day06.학생.권지언;

import java.util.Scanner;

public class money5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int max = 1;
		int idx = 0;

		Object[][] arr = new Object[max][8];
		int[] money = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };

		while (true) { 
			
			
			if (idx >= max) {
				max += 1;
				Object[][] newarr = new Object[max][8];
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						newarr[i][j] = arr[i][j];
					}
				}
				arr = newarr;
				System.out.println("배열생성완료");
			}
			
			

			System.out.println("이름 입력 : ");
			String name = sc.next();
			
			if (name.equals("stop")) {				
				break;
			}
			
			 
			

			System.out.println("비용 입력 : ");
			int cost = sc.nextInt();
			for (int i = 0; i < arr[idx].length; i++) {
				arr[idx][i] = cost / money[i];
				cost %= money[i];
			}
			idx++;
		}
		
		
		//
		
		System.out.println("시스템 종료, 총 금액 합산");
		for (int a = 0; a < arr.length - 1; a++) {
			System.out.println();
			for (int i = 0; i < arr[a].length; i++) {
				System.out.println(money[i] + "원 : " + arr[a][i]);
			}
		}
		sc.close();
		
		
		
	}
}
