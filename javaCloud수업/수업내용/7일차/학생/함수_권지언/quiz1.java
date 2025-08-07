package day07;

import java.util.Scanner;

public class quiz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수1을 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.println("수2을 입력하세요 : ");
		int num2 = sc.nextInt();
		System.out.println("두 수의 차 : "+subtract(num1, num2));
		sc.close();
	}

	public static int subtract(int a, int b) {
		int big = 0;
		int small = 0;
		if (a >= b) {
			big = a;
			small = b;
		} else {
			big = b;
			small = a;
		}
		int minus = big - small;
		return minus;
	}

}
