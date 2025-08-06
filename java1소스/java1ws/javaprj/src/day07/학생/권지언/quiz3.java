package day07.학생.권지언;

import java.util.Scanner;

public class quiz3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("투자금액을 입력하세요 : ");
		int num = sc.nextInt();
		System.out.println("두배가된 투자금 : "+doublemoney(num)+"원");
		sc.close();
	}

	public static int doublemoney(int a) {
		int money = a * 2;
		return money;
	}

}
