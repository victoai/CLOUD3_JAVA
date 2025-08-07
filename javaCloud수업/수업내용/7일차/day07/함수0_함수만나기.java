package day07;

import java.util.Scanner;

public class 함수0_함수만나기 implements 변경하기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner( System.in);	
		loop:while(true) {			
			System.out.println("메뉴: 1.등록, 2.조회, 3.변경,  4.종료");
			int menu  = sc.nextInt();
			
			switch(menu) {
			case  1:
				 등록하기();	  //등록하기  매서드 호출			
				break;
			case  2:
				 조회하기();   //조회하기 매서드 호출
				break;
			case 3:
				 조회하기();
				 변경하기();
				 조회하기();
				break;
			case 4:
				 System.out.println("종료");
				break loop;
			default:
				 System.out.println(" 메뉴 선택 잘못");
			}			
			
		}
	}

	public static void 변경하기() {
		System.out.println("변경합니다");
	}

	public static void 조회하기() {
		System.out.println(" ****조회합니다**");
	}

	//매서드 만들기
	
	public static void 등록하기() {
		System.out.println("등록합니다");
	}

}



/*
 
 함수사용 목적( 함수 사용 잇점)
 : 중복된 코드를 제거할 수 있다. (코드의 집중화)
 : 코드의 재사용  
 : 코드 변경( 코드의 유지보수가 쉬어진다.)
 : 코드분할 할 목적  ( 나눠진 코드(관련있는 코드)를 관리하기가 쉽다)
 
 재사용 + 코드 분할 
  
 */
