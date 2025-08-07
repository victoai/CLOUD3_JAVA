package day06.학생.권지언;

import java.util.Scanner;

public class schedule2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] arr = new String[7][5];
		int day1 = 0;

		while (true) {
			System.out.println("요일을 입력하세요 (월,화,수,목,금,토,일)");
			String day2 = sc.next();
			if(day2.equals("월")) {
				day1 = 0;
			}
			else if(day2.equals("화")) { 
				day1 = 1;
			}
			else if(day2.equals("수")) { 
				day1 = 2;
			}
			else if(day2.equals("목")) { 
				day1 = 3;
			}
			else if(day2.equals("금")) { 
				day1 = 4;
			}
			else if(day2.equals("토")) { 
				day1 = 5;
			}
			else {
				day1 = 6;
			}
			
			System.out.println("1.등록 2.조회 3.변경 4.삭제 5.종료");
			int num = sc.nextInt();
				
			switch (num) {
			case 1:
				System.out.println("추가할 일정을 입력하세요");
				String what = sc.next();
				for (int i = 0; i < arr[day1].length; i++) {
					if (arr[day1][i] == null) {
						arr[day1][i] = what;
						break;
					}
				}
				System.out.println();
				break;
				
			case 2:
				for (int i = 0; i < arr[day1].length; i++) {
					if (arr[day1][i] != null) {
						System.out.print(arr[day1][i] + " ");
					}
				}
				System.out.println();
				break;
				
			case 3:
				System.out.println("변경할 일정 인덱스를 선택하세요");
				int idx1 = sc.nextInt();
				System.out.println("변경할 일정을 입력하세요");
				String what1 = sc.next();
				arr[day1][idx1 - 1] = what1;
				System.out.println();
				break;
				
			case 4:
				System.out.println("삭제할 일정 인덱스를 선택하세요");
				int idx2 = sc.nextInt();
				for (int i = idx2 - 1; i < arr[day1].length - 1; i++) {
					arr[day1][i] = arr[day1][i + 1];
				}
				System.out.println();
				break;

			case 5:
				System.out.println("프로그램을 종료합니다");
				sc.close();
				System.exit(0);
				break;
			}
		}
	}
}
