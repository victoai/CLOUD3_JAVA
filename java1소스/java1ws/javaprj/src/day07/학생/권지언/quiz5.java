package day07.학생.권지언;

import java.util.Scanner;

public class quiz5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		judgeage(age);
		sc.close();
	}

	public static void judgeage(int age) {
		if (age < 20) {
			System.out.println("어른이 아닙니다");
		} else {
			System.out.println("어른입니다");
		}
	}

}
