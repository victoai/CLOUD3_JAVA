package day05;

import java.util.Scanner;

public class hardarr3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하세요 : ");
		int input = sc.nextInt();
		int[] arr = new int[input];
		int idx=0;
		
		for (int i = 1; i <= input; i++) {
			if(input%i==0) {
				arr[idx] = i;
				idx++;
			}
		}
		for(int i=0; i<idx; i++) {
			System.out.printf(arr[i]+" ");
		}
		sc.close();
	}
}
