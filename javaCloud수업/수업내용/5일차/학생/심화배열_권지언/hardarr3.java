package day05;

import java.util.Scanner;

public class hardarr3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하세요 : ");
		int input = sc.nextInt();
		
		for (int i = 1; i <= input; i++) {
			if(input%i==0) {
				System.out.print(i+" ");
			}
		}
		sc.close();
	}
}
