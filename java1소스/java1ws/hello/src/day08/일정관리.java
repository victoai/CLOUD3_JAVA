package day08;

import java.util.Scanner;

public class 일정관리 {
	
	
	static Scanner sc = new Scanner( System.in);
	static String[] schedule= new String[5];
	static int index=0;
	

	public static void main(String[] args) {
		 
		
		일정등록();
		
		일정조회();
		
		
		
		
	}
	
	
	
	//일정등록
	
	
	
	public static  void 일정등록() {

	  System.out.println("일정등록");
	  String title  = sc.next();
	  schedule[index] = title;
	  index++;
	  
		
	}
	
	//일정조회
	
	
	
	public static void  일정조회() {
		for( int i=0 ; i< index; i++) {
			System.out.println( schedule[i] );
		}
	}
	
	//일정변경
	
	
	public static void 일정변경() {
		
		
		System.out.println("변경할 일정");
		
		
	}
	
	
	
	//일정삭제
	

}
