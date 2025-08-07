package day05;

import java.util.Scanner;

public class arr01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			int input = sc.nextInt();
			arr[i] = input;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.printf(arr[i] + " ");
		}
		sc.close();
	}

}
