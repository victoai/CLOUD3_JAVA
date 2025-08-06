package day11.학생.김솔_하예진;

import java.util.Scanner;

public class datetest {

	public static void main(String[] args) {
		datelist[] dates = new datelist[3];
		int index = 0;
		Scanner sc = new Scanner(System.in);
		

		System.out.println("To Do List");
		System.out.println();

		loop: while (true) {
			System.out.println("1.등록 2.조회 3.수정 4.삭제 5.종료");
			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				System.out.println("일정은 최대 3개 등록 가능 합니다.");
				System.out.print("일정 내용을 입력하세요: ");
				String title = sc.nextLine();

				System.out.print("일정 시작일을 입력하세요 (예: YYYY-MM-DD): ");
				String date = sc.nextLine();

				System.out.print("남은 일정일을 입력하세요: ");
				int enddate = sc.nextInt();

				if (index < dates.length) {
					dates[index] = new datelist(title, date, enddate);
					index++;
				} else {
					System.out.println("더 이상 일정을 추가할 수 없습니다");
				}

				break;
			case 2:
				System.out.println("이하 등록된 일정 내용");
				System.out.println();
				for (int i = 0; i < index; i++) {
					dates[i].printTitle();
				}
				break;
			case 3:
				System.out.println("수정할 일정의 번호를 입력하세요: ");
				int editIndex = sc.nextInt() - 1;
				sc.nextLine();

				if (editIndex >= 0 && editIndex < index) {
					System.out.println("새 일정 내용을 입력하세요: ");
					title = sc.nextLine();
					System.out.println("새 일정 시작일 입력하세요 (예: YYYY-MM-DD): ");
					date = sc.nextLine();
					System.out.println("새 남은 일정일을 입력하세요: ");
					enddate = sc.nextInt();
					sc.nextLine();

					dates[editIndex] = new datelist(title, date, enddate);
					System.out.println("일정이 수정되었습니다.");
				} else {
					System.out.println("잘못된 일정 번호 입니다.");
				}
				break;
			case 4:
				System.out.println("삭제할 일정의 번호를 입력하세요: ");
				int deleteIndex = sc.nextInt() - 1;
				sc.nextLine();

				if (deleteIndex >= 0 && deleteIndex < index) {
					for (int i = deleteIndex; i < index - 1; i++) {
						dates[i] = dates[i + 1];
					}
					dates[--index] = null;  //마지막번째에   null
					
					System.out.println("일정이 삭제되었습니다.");
				} else {
					System.out.println("잘못된 일정 번호 입니다.");
				}
				break;
			case 5:
				System.out.println("종료");
				break loop;

			default:
				System.out.println("잘못된 메뉴 선택입니다.");
				break;
			}
		}
		sc.close();
	}

}
