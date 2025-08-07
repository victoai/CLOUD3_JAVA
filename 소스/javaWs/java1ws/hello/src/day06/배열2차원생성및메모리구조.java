package day06;

public class 배열2차원생성및메모리구조 {

	public static void main(String[] args) {
		
		
		//2차원 배열  ( 표형태, 행, 열)
				
		int[][] arr=  new int[3][2];
		
		int[][] arr2 ;
		arr2 = new int[3][2];
		
		
		
		int[][] arr3 = {
			
				{2,4} ,
				{1,3},
				{5,6}
				
		};
		
		System.out.print( arr3[0][0] +" ");
		System.out.println( arr3[0][1]);
		
		System.out.print( arr3[1][0]+" ");
		System.out.println( arr3[1][1]);
		
		
		System.out.print( arr3[2][0]+" ");
		System.out.println( arr3[2][1]);
		
		
	
		
		
			
		
		
		
	}

}
