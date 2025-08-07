package day06;

import java.util.Scanner;

public class 학생삭제하기2 {

	public static void main(String[] args) {
		 
	//학생정보 (학생이름) 조회하기  ( 학생이름 배열 필요함 )
		
		String[] names  = new String[5];
		Scanner sc = new Scanner( System.in);
		
		int index=5;  // 배열에 등록된 크기 
		 
		names[0]="정연수";
		names[1]="최지태";
		names[2]="김보성";
		names[3]="황예지";
		names[4]="최하은";
		
		
		//학생조회 
		for( int i=0; i< names.length ; i++) {
			System.out.println( (i+1) + names[i]);
		}
		
		
		//삭제할 학생번호 입력 받는다 
		
		int deleteNo = sc.nextInt();   //2
		
		deleteNo= deleteNo-1;  //  1
		
		
		
		 
		//
		//  0       <1>        2        3      4
		//  1        2         3        4      5
		//"정연수 "  "최지태"   "김보성"   "황예지"  "최하은" 
		//"정연수 "  "김보성"   "황예지"   "최하은"  "최하은"  <=삭제된 모습 
		
		
		
		for( int i=deleteNo  ; i< names.length-1 ; i++) {
			names[i]= names[i+1];			
		}
		
		//학생카운트가 감소해야 한다 
		
		//조회하기  
		for(int i=0 ; i<  names.length  ; i++ ) {  //5  0~4  , 4=> 0~3
			System.out.println( names[i]);
		}
		
		index--;
		
	 
		
		//조회하기 
		System.out.println("삭제되었습니다");
		for(int i=0 ; i< index ; i++ ) {  //5  0~4  , 4=> 0~3
			System.out.println( names[i]);
		}
		
		 
		
		
		
	}

}
