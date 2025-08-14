package hello;

import java.util.Scanner;

public class 양수음수개수구하기 { 
	
	public static void main(String[] args) {
		 
		//키보드 입력   Scanner sc  = new Scanner(System.in);
		//모니터 출력   System.out.println( "hello");
		
		Scanner sc = new Scanner( System.in);
		
		//변수선언		
		//정수형변수 만들기   int a ; 		
		int pos_cnt=0, neg_cnt=0, even_cnt=0, odd_cnt=0;
		int number; 
		//int i;  //반복제어				
		final int MAX=6;   //상수 		
		
		for( int i=1; i<=MAX;i++ ) {
			number = sc.nextInt();
			
			if( number >0) {
				  pos_cnt= pos_cnt +1; //pos_cnt++;
				  
				  if( number %2 ==0 ) {
					   even_cnt++;
					  
				  }else {
					  odd_cnt++;
				  }
				
			}else {
				  neg_cnt++;
			} 
			
		}  
		
		//
		System.out.println("양수의 개수" + pos_cnt);
		System.out.println("음숫의 개수" + neg_cnt);
		System.out.println("양수중 짝수 개수" + even_cnt);
		System.out.println("양수중 홀수 개수" + odd_cnt);
		
	}

}
