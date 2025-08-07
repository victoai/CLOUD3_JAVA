package day07.학생.이정호;

import java.util.ArrayList;
import java.util.Scanner;

public class 일정관리2차원 {

	public static void main(String[] args) {
		ArrayList<String>[] list = new ArrayList[7];
		for(int i = 0; i < 7; i++) {
			list[i] = new ArrayList<String>();
		}
	
		Scanner scan = new Scanner(System.in);
		
		String[] days = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		
		loop : while(true) {
			System.out.print("요일을 입력하세요 (0 ~ 6, 일 ~ 토) : ");
			int day = Integer.parseInt(scan.nextLine());
			
			System.out.println();
			System.out.println("<" + days[day] + ">");
			
			System.out.print("메뉴를 선택하시오 (1.등록, 2.조회, 3.변경, 4.삭제, 5.종료) : ");
			int menu = Integer.parseInt(scan.nextLine());
			
			switch(menu) {
			case 1:
				System.out.print("일정을 입력하세요 : ");
				String input = scan.nextLine();
				list[day].add(input);
				System.out.println();
				break;
			case 2:
				for(int i = 0; i < list[day].size(); i++) {
					System.out.println((i+1) + ". " + list[day].get(i));
				}
				System.out.println();
				break;
			case 3:
				System.out.print("수정할 일정 번호를 입력하세요 : ");
				int update = Integer.parseInt(scan.nextLine());
				System.out.print("일정을 새로 입력하세요 : ");
				String newInput = scan.nextLine();
				list[day].set(update - 1, newInput);
				System.out.println();
				break;
			case 4:
				System.out.print("삭제할 일정 번호를 입력하세요 : ");
				int delete = Integer.parseInt(scan.nextLine());
				list[day].remove(delete - 1);
				System.out.println();
				break;
			default:
				System.out.println("프로그램을 종료합니다.");
				break loop;
			}
		}
	}

}
