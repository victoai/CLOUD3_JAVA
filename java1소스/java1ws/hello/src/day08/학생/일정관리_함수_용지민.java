package day08.학생;

import java.util.Scanner;

public class 일정관리_함수_용지민 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		String[] arr = new String[5];
		int index = 0;
		
		loop: while(true) {
			System.out.println("---------------------------------------");
			System.out.println("1. 등록 2. 조회 3. 변경 4. 삭제 5. 종료");
			System.out.println("---------------------------------------");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1:
				index = register(arr, index);
				break;
			case 2:
				printArr(arr, index);
				break;
			case 3:
				index = update(arr, index);
				break;
			case 4:
				index = delete(arr, index);
				break;
			case 5:
				System.out.println("종료");
				break loop;
			default:
				System.out.println("잘못된 입력");
			}
		}

	}
	
	public static int register(String[] arr, int index) {
		System.out.println("등록");
		if(index >= 5) {
			System.out.println("일정은 최대 5개까지 등록 가능합니다");
			return index;
		}
		String schedule = sc.nextLine();
		arr[index] = schedule;
		index++;
		return index;
	}
	
	public static void printArr(String[] arr, int index) {
		System.out.println("조회");
		for(int i=0; i<index; i++) {
			System.out.println((i + 1) + ". " + arr[i]);
		}
	}
	
	public static int update(String[] arr, int index) {
		System.out.println("변경");
		if(index < 1) {
			System.out.println("변경할 일정이 없습니다");
			return index;
		}
		printArr(arr, index);
		System.out.println("변경할 번호를 입력하세요");
		int update = sc.nextInt() - 1;
		sc.nextLine();
		if(update + 1 > index) {
			System.out.println("잘못된 입력입니다");
			return index;
		}
		System.out.println("새로운 일정을 입력하세요");
		String newSchedule = sc.nextLine();
		arr[update] = newSchedule;
		return index;
	}
	
	public static int delete(String[] arr, int index) {
		System.out.println("삭제");
		if(index < 1) {
			System.out.println("삭제할 일정이 없습니다");
			return index;
		}
		printArr(arr, index);
		System.out.println("삭제할 번호를 입력하세요");
		int delete = sc.nextInt() - 1;
		sc.nextLine();
		if(delete + 1 > index) {
			System.out.println("잘못된 입력입니다");
			return index;
		}
		for(int i=delete; i<index-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[index-1] = "";
		index--;
		return index;
	}

}
