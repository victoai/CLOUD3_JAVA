package day07.학생;

import java.util.Scanner;

public class 하루일정관리 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String[] schedules = new String[5];
		int index = 0;
		
		loop: while(true) {
			System.out.println("---------------------------------------------------------------");
			System.out.println("1. 일정 등록, 2. 일정 조회, 3. 일정 변경, 4. 일정 삭제, 5. 종료");
			System.out.println("---------------------------------------------------------------");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1:
				System.out.println("일정 등록");
				if(index < 5) {
					schedules[index] = inputSchedule(schedules, index, sc);
					index++;
				} else {
					System.out.println("일정은 최대 5개까지 등록할 수 있습니다");
				}
				break;
			case 2:
				System.out.println("일정 조회");
				printSchedule(schedules, index);
				break;
			case 3:
				System.out.println("일정 변경");
				if(index >= 1) {
					System.out.println("변경할 일정을 선택해 주세요");
					printSchedule(schedules, index);
					int update = sc.nextInt();
					sc.nextLine();
					if(update > index) {
						break;
					}
					update--;
					schedules[update] = inputSchedule(schedules, index, sc);
				} else {
					System.out.println("변경할 일정이 없습니다");
				}
				break;
			case 4:
				System.out.println("일정 삭제");
				if(index >= 1) {
					System.out.println("삭제할 일정을 선택해 주세요");
					printSchedule(schedules, index);
					int delete = sc.nextInt();
					if(delete > index) {
						break;
					}
					delete--;
					deleteSchedule(schedules, index, delete);
					index--;
				} else {
					System.out.println("삭제할 일정이 없습니다");
				}
				break;
			case 5:
				System.out.println("종료");
				break loop;
			default:
				System.out.println("잘못된 입력");
			}
		}

	}
	
	public static String inputSchedule(String[] schedules, int index, Scanner sc) {
		System.out.println("일정을 입력해주세요");
		String schedule = sc.nextLine();
		return schedule;
	}
	
	public static void printSchedule(String[] schedules, int index) {
		for(int i=0; i<index; i++) {
			System.out.println((i + 1) + ". " + schedules[i]);
		}
	}
	
	public static void deleteSchedule(String[] schedules, int index, int delete) {
		for(int i=delete; i<index-1; i++) {
			schedules[i] = schedules[i + 1];
		}
	}

}
