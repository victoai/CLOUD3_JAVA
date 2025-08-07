package day11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Schedule schdule = new Schedule();

		loop: while (true) {
			System.out.println("\n======== 일정 관리 프로그램 ========");
			System.out.println("1.추가, 2.조회, 3.수정, 4.삭제, 0.종료");
			System.out.print("메뉴선택(번호): ");

			int menu = sc.nextInt();
			sc.nextLine(); // 버퍼 비우기 (nextInt 뒤에 nextLine을 사용하기 위해)

			switch (menu) {
			case 1:
				schdule.add();
				break;
			case 2:
				schdule.view();
				break;
			case 3:
				schdule.update();
				break;
			case 4:
				schdule.delete();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				sc.close(); // Scanner 객체 닫기
				break loop;
			default:
				System.out.println("잘못된 입력입니다. 다시 선택하세요.");
			}
		}
	}
}
