package day05;

import java.util.Scanner;

public class arr02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			int input = sc.nextInt();
			if(input!=0) {
				arr[i] = input;	
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0) {
				System.out.printf(arr[i] + " ");
			}
			
		}
		sc.close();

	}

}
