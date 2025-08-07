package day07;

public class 배열의합구하기 {

	public static void main(String[] args) {
		 
		
		int[] kors= {80,90,87,99,100};
		
		//
		
		int sum=0;
		for( int  i=0; i< kors.length ; i++) {
			sum= sum  + kors[i];
		}
		
		// sum = sum + kors[0];
		//sum = sum + kors[1];
		//sum = sum + kors[2];
		//sum = sum + kors[3];
		//sum = sum + kors[4];
		System.out.println("합계" + sum);
		
		
		int result =  배열의합구하기(kors);
		System.out.println("합계" + sum);		

		
		
	}
	
	
	// 배열의 합을 구하는 함수 만들기
	//함수이름:
	//입력 : 배열   , int[]
	//반환:  합계  , int
	public static int  배열의합구하기( int[] score) {
		int sum =0;
		for( int i=0 ; i< score.length ; i++) {
			sum= sum+score[i];
		}	
		
		for( int i=0 ; i< score.length ; i++) {
			sum= sum+score[i];
		}	
		
		return sum;
	}
	

}
