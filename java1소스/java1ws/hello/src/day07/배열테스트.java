package day07;

import java.util.Arrays;

public class 배열테스트 {

	public static void main(String[] args) {


		int[][] arr= {  {2,4,6},{8,10,12}, {14,16,18} };
		
		
		
		for( int i=0; i< 3 ; i++) {
			for(  int j=0; j<3 ; j++) {
				
				
				arr[i][j] += j;
			}
		}
		
		//
		 
		
		
		
		System.out.println( Arrays.deepToString(arr));
		
	}

}
