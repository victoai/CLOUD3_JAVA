package day04;

import java.util.Arrays;

public class 피보나치 {

	public static void main(String[] args) {
		 
		
		long[] fibo = new long[50];
		
		
		fibo[0]=1;
		fibo[1]=1;
		
		for( int i=2; i<50; i++) {
			
			fibo[i] = fibo[i-1] + fibo[i-2];
			
		}
		
		
		
		System.out.println(  Arrays.toString(fibo));
	}

}
