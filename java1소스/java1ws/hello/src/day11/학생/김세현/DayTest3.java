package day11.학생.김세현;

import java.util.Scanner;

public class DayTest3 {
	
	Day[] days	= new Day[5];
	
	static int index =0;
	Scanner sc = new Scanner(System.in);
	
	
	public void run() {
		
		while(true) {
			System.out.println("1.일정등록, 2.조회, 3.일정변경, 4.종료");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu){
			case 1:
				register();
				break;
			case 2:
				printInfo();
				break;
			case 3:
				update();
				break;
			case 4:
				System.out.println("일정관리를 종료합니다");
				System.exit(0);
			default:
				break;
			}
		}
		
	}
	
	public void register() {
		System.out.println("새 일정을 등록합니다");
		System.out.println("일정, 날짜를 순서대로 입력해주세요");
		String title = sc.nextLine();
		String date = sc.nextLine();
		Day schedule = new Day(title, date);
		days[index] = schedule;
		index++;
	}
	
	public void printInfo() {
		System.out.println("일정을 조회합니다");
		for(int i = 0 ; i<index; i++) {
			System.out.println(days[i].toString());
		}
	}
	
	public void update() {
		System.out.println("변경할 내용을 선택해주세요 1.일정, 2.날짜");
		int num = sc.nextInt();
		if(num == 1) {
			System.out.println("변경하려는 일정의 번호를 입력해주세요");
			for(int i=0; i<index; i++) {
				int number = i+1;
				System.out.println(number+"."+days[i]);
			}
			int select1 = sc.nextInt()-1;
			sc.nextLine();
			
			System.out.println("변경할 일정을 입력해주세요");
			String newTitle = sc.nextLine();
			days[select1].setTitle(newTitle);
			System.out.println("변경되었습니다!!");
		} else if(num == 2) {
			System.out.println("변경하려는 날짜의 번호를 입력해주세요");
			for(int i=0; i<index; i++) {
				int number = i+1;
				System.out.println(number+"."+days[i]);
			}
			int select2 = sc.nextInt()-1;
			sc.nextLine();
			
			System.out.println("변경할 날짜를 입력해주세요");
			String newDate = sc.nextLine();
			days[select2].setDate(newDate);
			System.out.println("변경되었습니다!!");
		}
	}
	
	
	
	

	public static void main(String[] args) {

		DayTest3 schedule = new DayTest3();
		schedule.run();

	}

}
