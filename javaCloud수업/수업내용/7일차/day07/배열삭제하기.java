package day07;

public class 배열삭제하기 {

	public static void main(String[] args) {		 
		
		int[] arr= new int[5];		
		
		arr[0]=10;
		arr[1]=7;
		arr[2]=11;
		arr[3]=9;		
		
		int cnt=4;  //등록된 개수
		//삭제하기
		
		int choice = 1 ; //1번째를 삭제하고 싶다		
		int realIndex =choice-1; //0
		
		
		//   0   1   2   3   4
		//   10,  7, 11 , 9 , x 		
		//뒤의 요소를 앞의 요소칸에 넣어 주는 작업을 해야 함	 
		
		// 몇번 앞으로 보내야 하는지 앞으로 옮겨야 하는 반복 횟수  구하기
		// 반복횟수 = 총개수  - 삭제인덱스
		int 반복횟수   =   cnt   - choice;    // 삭제기준뒤로 몇개가 있는지 계산
		System.out.println( "반복횟수" + 반복횟수);
		
		int lastIndex = realIndex + 반복횟수;
		     
		for( int i=realIndex  ; i<=lastIndex  ; i++) {			
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
