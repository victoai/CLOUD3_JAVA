package hello;

import java.util.Random;

public class Ex05 {
	public static void main(String[] args) {
		int[] arr = new int[1000];
		int sum=0;
		double avg=0;
		Random rd = new Random();
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = rd.nextInt(100) + 1; 
		}

		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}

		avg = (double) sum / 1000;

		System.out.printf("합 : %d, 평균 : %.2f",sum,avg);
	}
}
