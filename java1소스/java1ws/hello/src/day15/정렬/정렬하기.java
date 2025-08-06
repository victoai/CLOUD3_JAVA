package day15.정렬;

public class 정렬하기 {

	public static void main(String[] args) {
		
		int[] arr  = { 10,5,8,11,7};
		
		//오름차순 
		
		//기준
		for( int  i=0  ; i< arr.length -1 ; i++) {
			//대상
			for( int j=i+1 ; j< arr.length ; j++) {
				
				if(  arr[i]  > arr[j]) {
					
					int temp;
					temp = arr[i];
					arr[i] =arr[j];
					arr[j] = temp;
					
				}
			}
			
			
		}
		
		//
		System.out.println( "정렬후");
		for( int num : arr) {
			System.out.print(  num  + "  ");
		}
		
		
		// 
		int a=10,b=5 ;
		int tmp;
		
		
		
	}

}
