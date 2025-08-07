package day07.학생;

import java.util.Scanner;

public class 함수만들기_최형진 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int[] result = a(x);
		for (int i = 0; i < result.length; i++) {
			if (result[i] != 0) {
				System.out.print(result[i] + " ");
			}else {
				continue;
			}
		}
		

	}
	
	public static int[] a(int x) {
		int[] result = new int[x];
		int cnt = 0;
		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				result[cnt] = i;
				cnt++;
			}
		}
		return result;
	}
}
