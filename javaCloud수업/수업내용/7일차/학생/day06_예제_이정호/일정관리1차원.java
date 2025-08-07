package day06;

import java.util.ArrayList;
import java.util.Scanner;

public class 일정관리1차원 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		loop : while(true) {
			System.out.print("메뉴를 선택하시오 (1.등록, 2.조회, 3.변경, 4.삭제, 5.종료) : ");
			int menu = Integer.parseInt(scan.nextLine());
			
			switch(menu) {
			case 1:
				System.out.print("일정을 입력하세요 : ");
				String input = scan.nextLine();
				list.add(input);
				System.out.println();
				break;
			case 2:
				for(int i = 0; i < list.size(); i++) {
					System.out.println((i+1) + ". " + list.get(i));
				}
				System.out.println();
				break;
			case 3:
				System.out.print("수정할 일정 번호를 입력하세요 : ");
				int update = Integer.parseInt(scan.nextLine());
				System.out.print("일정을 새로 입력하세요 : ");
				String newInput = scan.nextLine();
				list.set(update - 1, newInput);
				System.out.println();
				break;
			case 4:
				System.out.print("삭제할 일정 번호를 입력하세요 : ");
				int delete = Integer.parseInt(scan.nextLine());
				list.remove(delete - 1);
				System.out.println();
				break;
			default:
				System.out.println("프로그램을 종료합니다.");
				break loop;
			}
		}
	}

}
