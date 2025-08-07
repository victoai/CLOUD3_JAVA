package day07;

import java.util.Scanner;

//관리프로그램 ( 1.조회, 2.등록, 3.종료)

//상품관리프로그램
public class 관리프로그램2 {

	public static void main(String[] args) {
		
		//상품저장할 수 있는 배열
		String[] goods = new String[10];
		int index=0; // 배열의 인덱스 
				
		
		//메뉴가 계속 동작할 수 있도록
		Scanner sc = new Scanner( System.in);
		loop: while( true) {
			System.out.println(" 메뉴를 선택하세요:  1.등록, 2.조회, 3. 종료" );
			String menu_  = sc.nextLine();    // "1"
			int menu =  Integer.parseInt(menu_);  //1
			switch( menu) {			
			case 1:
				System.out.println("등록");
				System.out.println("등록할 상품을 입력하세요");
				String name  = sc.nextLine();
				goods[index]= name;
				index++;
				break;
			case 2:
				System.out.println("조회");				
				for( int i=0; i<index; i++) {
					System.out.println( goods[i]);
				}					
				break;
			case 3:
				System.out.println( "종료");
				break loop;
			}			
		}
		

		System.out.println(" 프로그램 종료");
	}

}
