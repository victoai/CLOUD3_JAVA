package day08;

public class Program12 {

	public static void main(String[] args) {
		 
		
	
		int[] arr  = new int[] { 10,3,5,11,8,9};  //원본배열
		int [] result  = new int[ arr.length];    //결과배열   { 10,8, 0, 0,0 , 0}
		
		int cnt=0;
		
		for( int i=0 ; i < arr.length; i++) {
			
			if( arr[i] %2 ==0) {
				result[cnt] = arr[i];
				cnt++;
			}
		}
		
		
		// 
		for( int  i=0 ; i< result.length; i++) {
			System.out.println( result[i]);
		}
		
		
		//
		int[] arr2 = {8,9,12,5,9,12};
		int[] result2 = 짝수담기(arr2 );
		
		for( int i=0 ; i< arr.length; i++) {
			System.out.println( result2[i]);
		}
		

	}
	
	
	// 기능 : 배열을 받아서 짝수만 배열로 반환하는 거
	// 입력 : 배열
	// 반환 : 짝수배열
	
	public static  int[]   짝수담기(  int[] arr) {
		
		int [] result  = new int[ arr.length];    //결과배열   { 10,8, 0, 0,0 , 0}
		
		int cnt=0;
		
		for( int i=0 ; i < arr.length; i++) {
			
			if( arr[i] %2 ==0) {
				result[cnt] = arr[i];
				cnt++;
			}
		}
		
		
		/* 
		for( int  i=0 ; i< result.length; i++) {
			System.out.println( result[i]);
		}*/
		
		return result;
		
	}
	

}
