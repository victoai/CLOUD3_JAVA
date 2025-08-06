package day06;

import java.util.Arrays;

public class 배열삭제2 {

	public static void main(String[] args) {
		 
		
		int[] arr = {10,9,8,7};
		
		int index=2-1;
		
		for( int i=index;  i< arr.length-1 ; i++ ) {
			arr[i] = arr[i+1];
		}
		
		
		System.out.println( Arrays.toString(arr));

	}

}
