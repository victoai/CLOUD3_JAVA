package day07.학생;

import java.util.Scanner;

public class 일주일일정관리_용지민 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String[][] schedules = new String[7][5];
		String[] days = {"월", "화", "수", "목", "금", "토", "일"};
		int[] index = new int[7];    // 각 일의 일정 index   
		
		
		
		int day;   // 행의 index  (일)
		
		loop: while(true) {
			System.out.println("---------------------------------------------------------------------------------------");
			System.out.println("1. 일정 등록, 2. 요일 일정 조회, 3. 전체 일정 조회, 4. 일정 변경, 5. 일정 삭제, 6. 종료");
			System.out.println("---------------------------------------------------------------------------------------");
			
			int menu = sc.nextInt();
			
			sc.nextLine();
			
			switch(menu) {
			case 1:
				System.out.println("일정 등록");
				System.out.println("요일을 선택하세요");
				
				for(int i=0; i<days.length; i++) {
					System.out.print((i + 1) + ". " + days[i] + "요일   ");
				}
				System.out.println();
				
				day = sc.nextInt() - 1;
				
				sc.nextLine();
				
				System.out.println("일정을 입력하세요");
				
				String schedule = sc.nextLine();
				schedules[day][index[day]] = schedule;
				index[day]++;
				
				break;
			case 2:
				System.out.println("요일 일정 조회");
				System.out.println("요일을 선택하세요");
				
				for(int i=0; i<days.length; i++) {
					System.out.print((i + 1) + ". " + days[i] + "요일   ");
				}
				System.out.println();
				
				day = sc.nextInt() - 1;
				
				System.out.println(days[day] + "요일");
				
				for(int i=0; i<index[day]; i++) {
					System.out.println((i + 1) + ". " + schedules[day][i]);
				}
				
				break;
			case 3:
				System.out.println("전체 일정 조회");
				
				for(int i=0; i<schedules.length; i++) {
					System.out.println(days[i] + "요일");
					for(int j=0; j<index[i]; j++) {
						System.out.println((j + 1) + ". " + schedules[i][j]);
					}
					System.out.println();
				}
				
				break;
			case 4:
				System.out.println("일정 변경");
				System.out.println("요일을 선택하세요");
				
				for(int i=0; i<days.length; i++) {
					System.out.print((i + 1) + ". " + days[i] + "요일   ");
				}
				System.out.println();
				
				day = sc.nextInt() - 1;
				
				System.out.println("일정을 선택하세요");
				System.out.println(days[day] + "요일");
				
				for(int i=0; i<index[day]; i++) {
					System.out.println((i + 1) + ". " + schedules[day][i]);
				}
				
				int update = sc.nextInt() - 1;
				
				sc.nextLine();
				
				System.out.println("일정을 입력하세요");
				
				String schedule_update = sc.nextLine();
				schedules[day][update] = schedule_update;
				
				break;
			case 5:
				System.out.println("일정 삭제");
				System.out.println("요일을 선택하세요");
				
				for(int i=0; i<days.length; i++) {
					System.out.print((i + 1) + ". " + days[i] + "요일   ");
				}
				System.out.println();
				
				day = sc.nextInt() - 1;
				
				System.out.println("일정을 선택하세요");
				System.out.println(days[day] + "요일");
				
				for(int i=0; i<index[day]; i++) {
					System.out.println((i + 1) + ". " + schedules[day][i]);
				}
				
				int delete = sc.nextInt() - 1;
				
				for(int i=delete; i<index[day]-1; i++) {
					schedules[day][i] = schedules[day][i + 1];
				}
				
				index[day]--;
				
				break;
			case 6:
				System.out.println("종료");
				
				break loop;
			default:
				System.out.println("잘못된 입력");
			}
		}

	}

}
