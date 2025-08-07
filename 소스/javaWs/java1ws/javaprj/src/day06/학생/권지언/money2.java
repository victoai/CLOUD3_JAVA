package day06.학생.권지언;

import java.util.Scanner;

public class money2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		int[] money = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };

		System.out.println("금액을 입력하세요 : ");
		int cost = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = cost / money[i];
			cost %= money[i];
			System.out.println(money[i]+"원 : "+arr[i]);
		}
		sc.close();
	}
}
