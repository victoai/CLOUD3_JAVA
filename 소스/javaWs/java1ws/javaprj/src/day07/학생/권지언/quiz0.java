package day07.학생.권지언;

import java.util.Scanner;

public class quiz0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수1을 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.println("수2을 입력하세요 : ");
		int num2 = sc.nextInt();
		System.out.println("두 수의 합 : "+sumnum(num1,num2));
		sc.close();
	}

	public static int sumnum(int a,int b) {
		int sum = a + b;
		return sum;
	}
	
}
