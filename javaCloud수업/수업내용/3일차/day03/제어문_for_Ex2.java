package day03;

import java.util.Scanner;

public class 제어문_for_Ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner( System.in);

		for( int i=1 ; i<=3; i++) {
			 
			int menu;
			menu = sc.nextInt();
			
			switch( menu) {
			case 1:
				System.out.println("1.등록합니다");
				break;
			case 2:
				System.out.println("2.조회합니다");
				break;
			case 3:
				System.out.println("3.변경합니다");
				break;
			case 4:
				System.out.println("4. 삭제합니다");
				break;
			default :  //그 밖의 모든것
				System.out.println( "메뉴선택이 잘못되었다");				
			}		
			
			
		}


	}

}
