package day05;

import java.util.Scanner;

public class hardarr1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int cnt = 0;

		while (cnt < 10) {
			int input = sc.nextInt();
			if (input % 2 == 0) {
				arr[cnt] = input;
				cnt++;
			}
			if (input == 0) {
				break;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				System.out.printf(arr[i] + " ");
			}

		}
		sc.close();
	}
}
