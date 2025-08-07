package day06;

import java.util.Scanner;

public class 학생삭제 {

	public static void main(String[] args) {
		
		String[] arr = new String[] { "김솔" ,"주형준" , "김채윤","송수빈" ,"이효진"};
		int index=5;
		
		
		Scanner sc = new Scanner( System.in);
		System.out.println("삭제할 학생번호 선택");
		int delete = sc.nextInt() -1;   //1 ->0  , 2 ->1
		
		
		// 2  ~3
		for( int i= delete  ; i < arr.length-1 ;  i++) {			
			arr[i] = arr[i+1];        
			
		}		
		index--;
		
	   	  // delete가 2일 때
		  //     arr[2]   <=    arr[3];
		  //     arr[3]   <=    arr[4]; 		
		 //
		for( int i=0; i< index ; i++) {
			System.out.println( arr[i]);
		}
		
	}

}
