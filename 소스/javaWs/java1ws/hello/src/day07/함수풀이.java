package day07;

public class 함수풀이 {

	public static void main(String[] args) {


		// 
		int[] kors;
		kors  = new int[] { 90,80,97,60,65};		
		//가장큰값 구하기 (함수)매서드 만들기
		int max  =getMax( kors);
		System.out.println( max);
		 
		
	}
	
	//기능: 배열의 가장큰값 구하기
	//입력: 배열
	//반환: 가장큰값
	public static int getMax( int[] arr) {
		//
		int max=0; 
		for( int i=0; i< arr.length ; i++) {
			if( max < arr[i]) {
				max = arr[i];
			}
		}		
		return max;
	}

}
