package day06.학생.권지언;

import java.util.Scanner;

public class money4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		int[] money = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };

		while (true) {
			System.out.println("이름 입력 : ");
			String name = sc.next();
			if(name.equals("stop")) {
				System.out.println("시스템 종료");
				for(int i=0; i<arr.length; i++) {
					System.out.println(money[i] + "원 : " + arr[i]);
				}
				sc.close();
				break;
			}
			System.out.println("비용 입력 : ");
			int cost = sc.nextInt();
			for (int i = 0; i < arr.length; i++) {
				arr[i] += cost / money[i];
				cost %= money[i];
			}
		}
	}
}
