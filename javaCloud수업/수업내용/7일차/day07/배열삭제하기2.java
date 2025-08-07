package day07;

public class 배열삭제하기2 {

	public static void main(String[] args) {		 
		
		int[] arr= new int[5];		
		
		arr[0]=10;
		arr[1]=7;
		arr[2]=11;
		arr[3]=9;		
		
		int cnt=4;  //등록된 개수
		//삭제하기
		
		int choice = 2 ; //2번째를 삭제하고 싶다		
		int realIndex =choice-1; //1
		
		
		//   0   1   2   3   4
		//   10,  7, 11 , 9 , x 		
		//뒤의 요소를 앞의 요소칸에 넣어 주는 작업을 해야 함	 		 
		     
		for( int i=realIndex  ; i< cnt-1  ; i++) {			
			arr[i] = arr[i+1];			
			System.out.println( 	arr[i]    + "<===="+  arr[i+1] );			
		}		
		
		
		cnt--;
		//  개수를 하나를 감소한다		
		System.out.println(" 삭제후 ===>");		
		for( int i=0; i< cnt; i++ ) {
			System.out.println(  arr[i]);
		}
		
		

	}

}
