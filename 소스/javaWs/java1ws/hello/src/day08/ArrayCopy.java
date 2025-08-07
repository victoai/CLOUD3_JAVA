package day08;

public class ArrayCopy {

	public static void main(String[] args) {
		 

		int[] arr  = new int [] { 5,8,4,9};		
		int cnt  =4;
		int[] newArr = new int[4];
		
		
		
		
		//             원본배열, 시작위치, 대상배열, 시작위치, 복사할 개수
		System.arraycopy(arr, 0, newArr, 0, cnt);
		
		
		
		for( int i=0 ; i< newArr.length ; i++) {
			System.out.println(  newArr[i]);
		}
		
		
		
		
		
		
	}

}
