package day08;

public class 배열의합구하기 {

	public static void main(String[] args) {
		 
		
		int[] arr  = new int[] {70,88,100,89,95};
		
		
		int sum =0;
		sum = sum +  arr[0];
		sum = sum +  arr[1];
		sum = sum +  arr[2];
		sum = sum +  arr[3];
		sum = sum +  arr[4];
		
		
		System.out.println( sum );
		
		//배열의 합 함수호출하기
		
		int result  =  배열의합구하기( arr);
		System.out.println( result);
		int result2 =배열의가장큰값구하기(arr);
		System.out.println( result2);
		
		
		
		 
	}
	
		
	
	//배열의 합을 반환하는 함수 만들기 
	//기능: 배열의 합구하기
	//입력: 배열  
	//반환 : 배열 요소의 합계
	
	public static int  배열의합구하기( int[] arr) {		
		int sum =0;
		sum = sum +  arr[0];
		sum = sum +  arr[1];
		sum = sum +  arr[2];
		sum = sum +  arr[3];
		sum = sum +  arr[4];	
		
		return sum;
		
	}	
	
	//배열에서 가장큰값 반환하기 
	
	public static int 배열의가장큰값구하기( int[] arr) {		
		int max=arr[0];    // 		
		for( int i=0; i< arr.length ; i++) {			
			if( arr[i]  > max) {
				max  = arr[i];
			}			
		}		
		return  max;
	}
	
	
	//기능   :메뉴 추천 기능
	//입력  :없다 
	//반환 : 임의의 메뉴
	
	

}
