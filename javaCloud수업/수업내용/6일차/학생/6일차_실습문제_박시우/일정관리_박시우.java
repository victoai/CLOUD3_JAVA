package day06;

import java.util.Scanner;

public class 일정관리_박시우 {
	public static void main(String[] args) {
		String[] schedule = new String[5];
		Scanner sc = new Scanner(System.in);
		int idx=0;
		
		loop:while(true) {
			System.out.println("일정 관리: 1.추가 2.삭제 3.조회 4.종료");
			int mode = sc.nextInt();
			
			switch(mode) {
			case 1:
				System.out.print("추가할 일정을 입력하세요");
				String schedule_add = sc.next();
				schedule[idx]=schedule_add;
				idx++;
				break;
			case 2:
				System.out.print("삭제할 일정의 번호를 입력하세요");
				int schedule_remove = sc.nextInt();
				for(int i=schedule_remove-1; i<schedule.length-1; i++) {
					schedule[i]=schedule[i+1];
				}
				idx--;
				break;
			case 3:
				for(int i=0; i<idx; i++) {
					System.out.println((i+1)+". "+schedule[i]+" ");
				}
				break;
			case 4:
				System.out.print("종료합니다");
				break loop;
			}
		}
		
	}
}
