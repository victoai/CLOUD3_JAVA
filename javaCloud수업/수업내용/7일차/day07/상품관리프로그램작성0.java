package day07;

import java.util.Scanner;

public class 상품관리프로그램작성0 {

	public static void main(String[] args) {
		
		//상품배열준비		
		String[] goods = new String[5];
		int index=0;
		
		//
		Scanner sc = new Scanner (System.in);
		
		
	loop:while( true) {
			
			System.out.println( "메뉴를 선택하세요 1. 등록, 2.조회 , 3.변경, 4.삭제 ,5. 종료");
			String menu  = sc.nextLine();
			
			switch( menu) {
			case "1":
				System.out.println("등록");
				break;
			case "2":
				
				System.out.println( "조회");
				break;
			case  "3":
				System.out.println( "변경");
				break;
				
			case "4":
				System.out.println("삭제");
				break;
			case "5":
				System.out.println("종료");				
				break loop;
			default :
				System.out.println(" 잘못된 메뉴");
				//프로그램 종료
				System.exit(0);			
			}			
		}
		
		
		
		
		
		 

	}

}
