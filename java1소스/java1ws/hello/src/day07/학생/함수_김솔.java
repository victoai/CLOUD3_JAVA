package day07.학생;

import java.util.Scanner;

public class 함수_김솔 {

	public static void main(String[] args) {
//무슨 주=> 무슨 요일=> 일정 출력 
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("에이콘아카데미 8월 일정");
		
		while(true) {
			System.out.println(); //빈 줄
			
			System.out.println("1.첫째주 2.둘째주 3.셋째주 4.넷째주 5.다섯째주 6.일정종료");
			int week=sc.nextInt();
			
			switch(week) {
			case 1: 
				day_choice1(sc);
				break;
			case 2: 
				day_choice2(sc);
				break;
			case 3:
				day_choice3(sc);
				break;
			case 4:
				day_choice4(sc);
				break;
			case 5:
				day_choice5(sc);
				break;
			case 6:	
				System.out.println("일정종료");
				sc.close();
				return;
			default: System.out.println("다시 선택해주세요");
			}
		}
	}
	
	public static void day_choice1(Scanner sc) {
		System.out.println("1.월요일 2.화요일 3.수요일 4.목요일 5.금요일");
		int dayOf=sc.nextInt();
		
		switch(dayOf) {
		case 1:
			schedule1_1(sc);
			break;
		case 2:
			schedule1_2(sc);
			break;
		case 3: 
			schedule1_3(sc);
			break;
		case 4:
			schedule1_4(sc);
			break;
		case 5: 
			schedule1_5(sc);
			break;
		default: System.out.println("주말은 쉽니다");
		}
	}
	
	public static void day_choice2(Scanner sc) {
		System.out.println("1.월요일 2.화요일 3.수요일 4.목요일 5.금요일");
		int dayOf=sc.nextInt();
		
		switch(dayOf) {
		case 1:
			schedule2_1(sc);
			break;
		case 2:
			schedule2_2(sc);
			break;
		case 3: 
			schedule2_3(sc);
			break;
		case 4:
			schedule2_4(sc);
			break;
		case 5: 
			schedule2_5(sc);
			break;
		default: System.out.println("주말은 쉽니다");
		}
		
	}
	
	public static void day_choice3(Scanner sc) {
		System.out.println("1.월요일 2.화요일 3.수요일 4.목요일 5.금요일");
		int dayOf=sc.nextInt();
		
		switch(dayOf) {
		case 1:
			schedule13_1(sc);
			break;
		case 2:
			schedule3_2(sc);
			break;
		case 3: 
			schedule3_3(sc);
			break;
		case 4:
			schedule3_4(sc);
			break;
		case 5: 
			schedule3_5(sc);
			break;
		default: System.out.println("주말은 쉽니다");
		}
		
	}
	
	public static void day_choice4(Scanner sc) {
		System.out.println("1.월요일 2.화요일 3.수요일 4.목요일 5.금요일");
		int dayOf=sc.nextInt();
		
		switch(dayOf) {
		case 1:
			schedule4_1(sc);
			break;
		case 2:
			schedule4_2(sc);
			break;
		case 3: 
			schedule4_3(sc);
			break;
		case 4:
			schedule4_4(sc);
			break;
		case 5: 
			schedule4_5(sc);
			break;
		default: System.out.println("주말은 쉽니다");
		}
		
	}
	
	public static void day_choice5(Scanner sc) {
		System.out.println("1.월요일 2.화요일 3.수요일 4.목요일 5.금요일");
		int dayOf=sc.nextInt();
		
		switch(dayOf) {
		case 1:
			schedule5_1(sc);
			break;
		case 2:
			schedule5_2(sc);
			break;
		case 3: 
			schedule5_3(sc);
			break;
		case 4:
			schedule5_4(sc);
			break;
		case 5: 
			schedule5_5(sc);
			break;
		default: System.out.println("주말은 쉽니다");
		}
	}
	
	
	
	public static void schedule1_1(Scanner sc) {
		System.out.println("일정없음");
	}
	
	public static void schedule1_2(Scanner sc) {
		System.out.println("일정없음");
	}
	
	public static void schedule1_3(Scanner sc) {
		System.out.println("일정없음");
	}
	
	public static void schedule1_4(Scanner sc) {
		System.out.println("1일차: 자바설치, 자바로 코드 작성법, 순서도 작성법(변수의 역할, 약속된 기호로 절차표현)");
		System.out.println("과제: 체계적인 문제풀이, 순서도 작성하기");
	}
	
	public static void schedule1_5(Scanner sc) {
		System.out.println("2일차: 체계적인 문제풀이 방법(자료명세, 처리과정, 순서도 작성하기)");
	}
	
	public static void schedule2_1(Scanner sc) {	
		System.out.println("3일차: 문제풀이 발표, 변수연산자제어구조학습(소병학님 발표)");
		System.out.println("과제: 문제풀이를 코드로 구현해보자");
	}
	
	public static void schedule2_2(Scanner sc) {
		System.out.println("4일차: 문제풀이 코딩");
	}
	
	public static void schedule2_3(Scanner sc) {
		System.out.println("5일차: 배열(송병화님 발표)");
		System.out.println("과제: 배열관련 문제풀이");
	}
	
	public static void schedule2_4(Scanner sc) {
		System.out.println("6일차: 배열2(new 의미, 동적메모리, 정적메모리)");
	}
	
	public static void schedule2_5(Scanner sc) {
		System.out.println("7일차: 함수(김채운님 발표)");
	}
	
	public static void schedule13_1(Scanner sc) {
		System.out.println("8일차: 함수2");
		System.out.println("과제: 라이브러리 만들기");	
	}
	
	public static void schedule3_2(Scanner sc) {
		System.out.println("9일차: 클래스(type으로써의 클래스, 절차지향과 객체지향 코드)");
	}
	
	public static void schedule3_3(Scanner sc) {
		System.out.println("10일차: 클래스, 캡슐화-생성자, this, 패키지, 접근제어자(생성자오버로딩)");
	}
	
	public static void schedule3_4(Scanner sc) {
		System.out.println("광복절");
		}
	
	public static void schedule3_5(Scanner sc) {
		System.out.println("학원 휴관");
	}
	
	public static void schedule4_1(Scanner sc) {	
		System.out.println("11일차: 객체배열 다루기, 일정 관리프로그램 작성");
		System.out.println("과제: 객체배열을 이용한 간단한 프로그램 작성하기");
	}
	
	public static void schedule4_2(Scanner sc) {
		System.out.println("12일차: 클래스(static, nonstatic, 상속, 업캐스팅과 다운캐스팅)");	
	}
	
	public static void schedule4_3(Scanner sc) {
		System.out.println("13일차: 클래스(상속과 다형성)");
		System.out.println("과제: 나의 다형성예제 만들기");
	}
	
	public static void schedule4_4(Scanner sc) {
		System.out.println("14일차: Object, String, StringBullder, Wrrapper 클래스, ArrayList, 제네릭 맛보기");
	}
	
	public static void schedule4_5(Scanner sc) {
		System.out.println("15일차: 추상클래스, 인터페이스, 객체배열 정렬하기");
		System.out.println("과제: MyArrays 만들어보기");
	}
	
	public static void schedule5_1(Scanner sc) {	
		System.out.println("16일차: 예외처리하기, 파일다루기");
	}
	
	public static void schedule5_2(Scanner sc) {
		System.out.println("17일차: 프로젝트 발표 1일차");	
	}
	
	public static void schedule5_3(Scanner sc) {
		System.out.println("18일차: 프로젝트 발표 2일차");
	}
	
	public static void schedule5_4(Scanner sc) {
		System.out.println("19일차: 프로젝트 발표 3일차");
	}
	
	public static void schedule5_5(Scanner sc) {
		System.out.println("21일차: 멀티쓰레드와 네트워크 프로그램");
		System.out.println("과제: 채팅프로그램 만들어보기");
	}
	
	
}
