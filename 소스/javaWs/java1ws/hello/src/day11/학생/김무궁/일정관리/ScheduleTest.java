package day11.학생.김무궁.일정관리;

import java.util.Scanner;

public class ScheduleTest {

	public static void main(String[] args) {
		
		Schedule[] schedule = new Schedule[5];
		int index = 0;
		
		Scanner sc = new Scanner(System.in);
		
		loop:while(true) {
			System.out.println("할 일 1. 등록, 2. 조회, 3. 변경, 4. 종료");
			int todo = sc.nextInt();
			
			sc.nextLine();
			switch(todo) {
			case 1:
				System.out.println("요일, 할 일");		
				String day = sc.nextLine();
				String work = sc.nextLine();
				
				Schedule s = new Schedule(day, work);
				schedule[index] = s;
				index++;
				break;
			case 2:
				System.out.println("조회");
				
				for(int i=0; i<index; i++) {
					System.out.println(schedule[i].toString());
				}
				break;
			case 3:
				System.out.println("변경");
				System.out.println("변경할 요일");
				int select = sc.nextInt()-1;
				sc.nextLine();
				
				System.out.println("할 일 변경");
				String newWork = sc.nextLine();
				schedule[select].setWork(newWork);
				break;
			case 4:
				System.out.println("종료");
				break loop;
			}
		}
	}



}
