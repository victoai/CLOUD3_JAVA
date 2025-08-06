package day03;

import java.util.Scanner;

public class 김세현_사원임금 {

	public static void main(String[] args) {	 
		//
		Scanner sc = new Scanner( System.in);		
		//변수선언		
		//입력자료
		int work_time;
		int work_pay;		
		//출력자료
		double pay;		
		//처리자료		
		int work_time_over; // 초과근무시간
		double work_pay_over ;  //초과단가 		
		
		work_time = sc.nextInt();
		work_pay = sc.nextInt();	
		
		//임금구하기
		if( work_time  >40) {   // 60시간 이라면   20 *초과단가   +   40 *기본단가 )
			work_time_over  = work_time-40;
			work_pay_over  =  work_pay *1.5;				
			pay  =  ( work_time_over * work_pay_over) +  (40  *  work_pay );
			
		}else {
			pay  = work_time * work_pay;			
		}					
		//세금 
		if( pay  > 400000) {
			pay= pay -30000;
		}				
		//출력
		System.out.println( pay);	
		
	}

}
