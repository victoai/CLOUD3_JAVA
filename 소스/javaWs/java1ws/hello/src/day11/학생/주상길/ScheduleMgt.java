package day11.학생.주상길;

import java.util.Scanner;

public class ScheduleMgt {
	
	
	static Scanner sc = new Scanner(System.in);
	
	Day[] days;
	int index = 0;
	
	
	public void run() {
		
		while(true) {
			
			System.out.println();
			System.out.println("--일정관리---------------------");
			System.out.println("1.일정등록, 2.일정조회, 3.종료");
			System.out.println("-----------------------------");
			System.out.print("입력: ");
			
			int menu = sc.nextInt();
			
			
			sc.nextLine();
			switch(menu) {
			case 1:
				register();
				break;
			case 2:
				search();
				break;
			case 3:
				System.out.println("Bye~");
				System.exit(0);
				break;
			}
			
			
		}
	} //run
	
	
	

	public static void main(String[] args) {
		
		
		ScheduleMgt mgt = new ScheduleMgt();
		mgt.run();
		
	} //main
	
void register() {
	System.out.println("register");
	System.out.println("일정등록: 날짜, 제목, 내용");
	System.out.print("날짜입력: ");
	String date = sc.nextLine();
	
	System.out.println("(제목입력)");
	String title = sc.nextLine();
	System.out.println("(내용입력)");
	String desc = sc.nextLine();
	
	//백업
	Day[] daysOld = new Day[index];
	for(int i=0; i<index; i++) {
		daysOld[i] = days[i];
		}
	
	//신규등록
	index++;
	days = new Day[index];
	for(int i=0; i<index-1; i++) {
		days[i] = daysOld[i];
		}
	days[index-1] = new Day (date, title, desc);
	}

void search() {
	System.out.println("search");
	
	for(int i=0; i<index; i++) {
		System.out.println("(" + (i+1) + ") " + days[i].getTitle());
	}
	
	System.out.print("읽을 일정의 번호를 선택: ");
	int select = sc.nextInt();
	System.out.println("---------------------");
	System.out.println(days[select-1].getTitle());
	System.out.println("--");
	System.out.println(days[select-1].getDesc());
	System.out.println("---------------------");
	System.out.println("닫기[Any Key]");
	String exit = sc.nextLine();
	sc.nextLine();
	
}
	
	
	

}
